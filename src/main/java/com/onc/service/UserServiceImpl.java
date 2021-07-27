package com.onc.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    /**
     *
     * @param username
     * @param password
     * @return User exist or not
     */
    //TODO:(Version 2.0) LOGIN IN Section Rebuild using Spring Security
    @Override
    public boolean queryUserForLogin(String username, String password) {
        String root ="root";
        String pwd = "root";
        System.out.println(username+password+"  server is working");
        return (username.equals(root)) && (password.equals(pwd));
    }
}
