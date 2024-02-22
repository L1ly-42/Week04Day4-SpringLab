package com.example.task_01.controllers;

import com.example.task_01.models.GreetingPojo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/greeting")
public class Controller{

 // Old method:
//    @GetMapping("/greeting")
//    public String greeting(){
//        return "Good afternoon!";
//    }

    @GetMapping
    public GreetingPojo greetingPojo(){
        GreetingPojo greeting = new GreetingPojo("Leila","afternoon");
        return greeting;
    }






}