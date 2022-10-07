package com.example.demo44.controller;


import com.example.demo44.entities.Pruebas;
import com.example.demo44.entities.Reservation;
import com.example.demo44.service.PruebasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation") 
public class pruebasController {

    @Autowired
    private PruebasService pruebasService;

    @GetMapping("/all")
    public List<Pruebas> getAll(){
        return pruebasService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public  Pruebas save(@RequestBody Pruebas p){
        return pruebasService.save(p);
    }
}
