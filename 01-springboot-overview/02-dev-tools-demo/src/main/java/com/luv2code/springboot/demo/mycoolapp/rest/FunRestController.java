package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //expose " that will return hello world
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }
    @GetMapping("/workout")
    public String sayWorkOut(){
        return "workout";
    }
    @GetMapping("/fortune")
    public String fortune(){
        return "fortune";
    }
 }
