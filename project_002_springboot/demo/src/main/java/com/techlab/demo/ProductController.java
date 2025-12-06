package com.techlab.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    //POST      /products
    //GET       /products
    //PUT       /products/12
    //DELETE    /products/2


    //localhost:8080/hello
    @GetMapping("/hello")
    public String hellowWorld(){
        return "Hello comision 25254 World from Spring Boot!";
    }
}
