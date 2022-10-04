package com.example.demo44.controller;


import com.example.demo44.entities.Category;
import com.example.demo44.entities.Product;
import com.example.demo44.service.CategoryService;
import com.example.demo44.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> getCategories(){
        return categoryService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public  Category save(@RequestBody Category p){
        return categoryService.save(p);
    }
}
