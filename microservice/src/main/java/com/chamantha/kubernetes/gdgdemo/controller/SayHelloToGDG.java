package com.chamantha.kubernetes.gdgdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloToGDG {

    @GetMapping
    public String helloGDG(){
        return "Welcome to Kubernetes session ";
    }
}
