package com.sgr.main.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
	//private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String home() {
    	//logger.info("Accessing /home endpoint");
    	System.out.println("At home");
        return "Welcome to Home!";
    }

    @GetMapping("/hello")
    public String sayHi() {
    	
    	System.out.println("At hello");
        return "Hi!";
    }
}
