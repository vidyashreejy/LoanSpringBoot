package com.kuwy.rest.controller;

import com.kuwy.beans.Welcome;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class WelcomeController {
	private static final String welcomemsg = "Welcome to my first spring boot application. %s!";



    @GetMapping("/welcome/user")

    @ResponseBody

    public Welcome welcomeUser(@RequestParam(name="name", required=false, defaultValue="Java Fan") String name) {

        return new Welcome(String.format(welcomemsg, name));

    }

}
