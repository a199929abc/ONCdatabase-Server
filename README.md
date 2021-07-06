# ONC database-Project Overview

# ONC Database System Structure
 ![image](https://github.com/a199929abc/ONCdatabase-Server/blob/main/ONC%20%20database%20System.png)
From the analysis of two possible approaches, rebuilding the database seems like a more realistic and developer-friendly solution. However, only having the database itself is not enough for users to interact. The entire project can divide into three parts: 
Rewriting Paradox database to Mysql database and dealing with the specification issues between different schemas.
Building a server to interact with the database and handle various requests and post sends from the front-end, protecting the integrity and security of the database at the same time.
Developing a front-end to interact with the server and realizing the needs of users to add, delete, search and modify.
2.1 Client needs 
At the end of this project, the proposer wants the UI to take a part number, part status, and part revision as input, list out the name of the search part, revision, current status(Current in use, Closed, Superseded) and bill of materials which includes
Name of the material 
Quantity of the material needs to build the assembly 
Manufacturer of the material
Location of assembly instructions in the hard drive
All the properties on the list can be found in the ONC Paradox database, however, those data spread across multiple tables and each table has more than 200,000 rows, manual retrieval becomes impractical. 
2.2 database Rebuild
Since there is a limited number of resources online about the Paradox database and no formal method of transferring Paradox tables to Mysql, the conversion process became very tricky. However, the .db file is commonly used in the database system, it is the entry point to solve the problem. Online .db files to Mysql transfer software were all failed, which might be because of the difference between Paradox and Mysql schema configuration. Having an intermediary is extremely important to resolve the error. Paradox Database Reader(PDR) developed by Simplifying Technology became the solution. PDR is a standalone tool to view paradox db files[4]. It doesn’t require BDE/Corel to be installed on the machine[4]. Users can easily install the viewer in any system and read the Paradox database table.[See Figure 4]. 

				Figure 4 - Paradox Database Reader tool
PDR supports all versions of Paradox and provides many exporting options, users can save data to Excel 2003, plain text, XML, even HTML.  Since the PDR is only able to export Excel 2003, a limited number of rows is a potential threat, Excel version 2003 and before only supports a maximum of 65,536 rows. A larger database needs to manually select rows that need to be exported. ONC database contains more than 400,000 data, it takes a while to complete. The export result shows in figure 5. 
			Figure 5 - Paradox data transfer to Excel book
Excel books are commonly used nowadays, there are a large number of resources about how to import Excel books to Mysql database. MySQL for Excel is an official plugin provided by Oracle to map Excel books to Mysql tables. Since Paradox uses an old SQL form, the configuration of schema is different from Mysql. A large number of errors showed up during the transfer process. By using PDR and Mysql for Excel, the database was successfully rebuilt from the old Paradox to the current Mysql and the server started as expected (Part schema is shown in Figure 6).

			Figure 6 - Part table schema in Mysql 
2.3 Server Development
In order to realize users' requests of adding, deleting, searching and modifying the database through UI. Operation speed and convenience are the priority properties to consider.
From users’ perspective, web applications that use standard browsers, such as IE, Safari, have become part of the operating system, there is no need for special installations when using Web Applications. It basically can be accessed anywhere with the Internet without any restriction from operating systems or different browsers. It also has the advantage of being easy to update, reducing computer load and having many mature frameworks to work with, fully satisfying the request of convenience.
Web applications rely on the response of the server, it’s the most important part of the application. Through a preliminary study of the current hottest open-source server framework,  Spring boot 2.0 in Java satisfies the majority needs of the ONC database system. With the popularity of dynamic languages(Ruby, Groovy, Scala, Node.js), Java server development is particularly cumbersome, with numerous configurations, low development efficiency, complex deployment processes and difficulty integrating with third-party technologies.[2] Spring Boot 2.0(SB2.0) uses the concept of “habit is more important than configuration”, there are a large number of pre-built-in configurations, users don’t need to configure it manually, to a large extent reduce the difficulty of setting a server, speeding your project as well. SB2.0 provides a series of starter pom to simplify Maven’s dependency loading[2], for example, when users use spring-boot-start-web, all dependencies packages will be automatically added. SB2.0 supports running coaxial embedded containers, such as Tomcat, Jetty, and developers don’t need to set up extra socket containers[3].

Maven is the dependency management tool using in this project, it can integrate Java projects and manage dependencies with a few lines of XML[Example is shown in Figure 7]. 

Figure 7- Maven dependencies management pom.xml
			
 Figure 8 - Spring Boot 2.0 backend project structure
Maven also can handle the interdependence of multiple modules, which reduces the complexity of development. Following the recommended SB2.0 webserver project directory structure, which clearly classifies each module and its usage, the overall backend was set up properly shown in figure 8, the explanation is in the list below:
ONC database main package
controller: Controller mainly to build a bridge between the outside world and the service layer. When the front end calls the interface to access the related business, they will pass the controller, and the controller will adjust the relevant service layer and return the data to the front end. There are 2 controllers that exist in this project,
 user controller: Responsible for handling users’ login status, return whether users’ username matched password. 
Parts controller:  Responsible for handling specific part search based on its part Id, return part object as JSON result to the front end if the specific part exists in the database.
mapper: For data persistence operations on the database, its method statements are directly targeted at the database operations and mainly implement some addition, deletion operations. In Mybatis the methods are mainly mapped to each other with xxx.xml
pojo: It is a package to store plain ordinary java object. The role of the POJO class is to facilitate the programmer to use the data table in the database. Each row can be traded as an object. Fully implement Java object-oriented programming concept.
service: The service layer provides interfaces for classes of the controller layer to call. Generally, the method to serve each request written by the developer is encapsulated. Implementation is in serviceImpl. 
userService: Iterate the database and return the result to userController
partService: Iterate the database and search for the specific part then return the result to partController 
utils: This is a multifunctional tool-based package, contains tools like parsing JSON result, MK5 password encryption, etc.
oncApplication: Spring Boot server entry where to start the server
resources package
mapper: XML mappers store in this package. Used to manipulate the database
application.properties: This configuration file is to modify the configuration values of some default settings. ONC Mysql database connection was established here. Once the server starts running, SB2.0 will automatically connect to the database specified.
2.4 User Interface Development
The front-end is the presentation layer of the web application, a variety of different front-end frameworks emerge in an endless stream. The front-end of the ONC database system must satisfy the property of stability, smooth, respond quickly and easy to maintain. After querying through a large number of resources, React developed by Facebook became the most suitable option. React has the following features:
Efficient: React using virtual DOM simulation to minimize interaction with real DOM nodes, which reduce pages and components processing time, effectively update the rendering interface when the data changes[6]
Flexible: React is commonly used in front-end development. There are a large number of open-source external libraries and plugins that support it, like Ant Design, Material UI, Story Book, etc. Those supports to a large extent reduce the developing period for non-commercial application.
Active Community: React is one of the most active front-end communities, developers can easily obtain what they are looking for there. Most of the bugs have been fixed in the rapid version iteration.

		Figure 9 - formatted JSON result 
From the designing stage, the ONC database requires a minimum of two pages, login and parts detail search page. The login form will take the user's personal information and pass it to the ONC server for verification. The Parts search will take Part Number, Part Status, and Revision as input form, communicate through server with Axios HTTP post request and display the results based on the criteria. A successful front and back end communication cycle completed by receiving JSON results shown in figure 9. React will parse and format the received JSON result and write the receipt data to the specified location by rendering. From the beginning to the end of the post-request life cycle, the only communication medium between the front and backend is JSON object. The advantages of doing that are:
Improve work efficiency: Both front-end and backend only need to care about their own work, both developments can be carried out at the same time. The addition of pages or the modification of routing doesn’t have influences on the backend server, call JSON interface when it’s needed, to make development more flexible.
Reduce maintenance cost: Client-side problems no longer require server-side to participate and debug. Reducing coupling between different modules. Code refactoring and maintainability enhancement.
As shown in figure 10, all the information required by the client was successfully demonstrated on the page. 

				Figure 10 - UI of ONC database system

2.5 Query Optimization 
Since required properties spread in different tables. Simply writing query statements like “Select * from parts and boms'' wasn't efficient enough. Especially when multiple tables are querying together. Having a lot of similar SQL statements to deal with different query requirements was not efficient and well organized enough, it may cause unnecessary burdens for future additions and maintenance functions. MyBatis is an excellent persistence layer framework. MyBatis can configure and map primitive types through simple XML or annotations, interfaces and Java POJOs as records in the data[5]. Programmers can manipulate the database through the concept of Object-Oriented. After implementing Mybatis to the project, greatly reduce the number of Mysql statements, achieving the purpose of easy maintenance of the database.

3.0 Conclusion
At the end of the project, both the Spring Boot server and React front-end were running successfully, providing exactly the same information as the client’s needs in an efficient way. The overall project structure is organized in figure 11, using the development concept of separate front and backend not only to improve the scalability of the application but also to reduce coupling and improve development efficiency. Analyzing the feasibility of each approach before development is essential to avoid potential threats. Understanding users’ needs and designing the application using the fittest mode could to a large extent improve development efficiency.
