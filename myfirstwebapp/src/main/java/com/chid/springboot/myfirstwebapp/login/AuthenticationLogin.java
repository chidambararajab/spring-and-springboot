package com.chid.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationLogin {

    public boolean authenticateLogin(String name, String password){
        boolean isValidName = name.equalsIgnoreCase("chid");
        boolean isValidPassword = password.equalsIgnoreCase("chid@123");
        if(isValidName && isValidPassword){
            return true;
        }
        return false;
    }

}
