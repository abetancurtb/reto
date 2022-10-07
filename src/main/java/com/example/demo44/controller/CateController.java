package com.example.demo44.controller;


import com.example.demo44.entities.Cate;
import com.example.demo44.entities.Pruebas;
import com.example.demo44.service.CateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cate")
public class CateController {

    @Autowired
    private CateService cateService;

    @GetMapping("/all")
    public List<Cate> getAll(){
        return cateService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cate save(@RequestBody Cate p){
        return cateService.save(p);
    }
}
