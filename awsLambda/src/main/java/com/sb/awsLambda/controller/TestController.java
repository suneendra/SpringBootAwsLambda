package com.sb.awsLambda.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	 @RequestMapping("/")
     public String home(){
         return "Hello Hanuman!";
     }
	 
	 @RequestMapping("/hi")
     public String homeHi(){
         return "Hi!";
     }
}
