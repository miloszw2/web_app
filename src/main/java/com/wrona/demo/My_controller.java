package com.wrona.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class My_controller {
    @GetMapping
    public String hello(){
        String nowy = "czesc";
        return nowy;
    }
    @GetMapping(value = "/drugiepozdrowienie")
    public String helloaggain(){
        String nowy = "czescponownie";
        return nowy;
    }
}
