package com.onc.controller;


import com.onc.pojo.Parts;
import com.onc.pojo.Users;
import com.onc.service.UserService;
import com.onc.service.UserServiceImpl;
import com.onc.utils.JSONResult;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("*")
public class loginController {

    @Autowired
    private UserService userService;


    @RequestMapping("/login")
public JSONResult login( @RequestBody Users user )throws Exception{
    String username = user.getUsername();
    String password = user.getPassword();
    System.out.println("Loading ....");
    System.out.println(username);
    System.out.println(password);
    if(StringUtils.isBlank(username)||StringUtils.isBlank(password)){
        return  JSONResult.errorMsg("username and password does't match");
    }
    boolean result=userService.queryUserForLogin(username,password);
    if(result == true){
        System.out.println("login successful ");
        return JSONResult.ok(result);
    }else{
        System.out.println("login  fail");
        return JSONResult.errorMsg("Login  fail please retry ");
    }
}

}
