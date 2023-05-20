package com.sha.finaljavaappdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/aws")
    public String getString(){
        return "Welcome to Demo Java App";
    }
}