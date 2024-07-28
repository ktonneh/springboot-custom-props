package com.thexpertdev.orderapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final CustomProperties customProperties;

    @Autowired
    public OrderController(CustomProperties customProperties) {
        this.customProperties = customProperties;
    }


    @GetMapping("/customprops")
    private CustomProperties getCustomProperties(){
        return customProperties;
    }
}
