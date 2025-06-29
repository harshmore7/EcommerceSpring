package com.example.EcommerceSpring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/category")
public class CategoryController {
    @GetMapping
    String getCategory(){
        return "Skin Care";
    }
    @GetMapping("/count")
    int getCategoryCount(){
        return 13;
    }
}
