package com.example.springbasic.pages;

import org.springframework.stereotype.Component;

@Component
public class LoginPage {
    public LoginPage(){
        System.out.println("In Login Page");
    }

    public void dologin(){
        System.out.println("login success");
    }
}
