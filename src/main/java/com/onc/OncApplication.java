package com.onc;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@MapperScan("com.onc.mapper")

@ComponentScan(basePackages = {"com.onc","com.onc.service","com.onc.mapper"})
public class OncApplication {

    public static void main(String[] args) {
        System.out.println("Starting ...");
        SpringApplication.run(OncApplication.class, args);
        System.out.println("Starting Successful ...");
    }

}
