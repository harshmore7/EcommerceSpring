package com.example.EcommerceSpring.controllers;

import com.example.EcommerceSpring.services.FakeStoreCategoryService;
import com.example.EcommerceSpring.services.ICategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/category")
public class CategoryController {

    private final ICategoryService categoryService;

    CategoryController (ICategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping
    String getCategory(){
        return "Skin Care";
    }
    @GetMapping("/count")
    int getCategoryCount(){
        return 13;
    }
}
