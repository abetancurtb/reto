package com.example.demo44.controller;


import com.example.demo44.entities.Client;
import com.example.demo44.entities.Library;
import com.example.demo44.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<Client> getAll(){
        return clientService.getAll();
    }

    @PostMapping("/save")
    public  Client save(@RequestBody Client p){
        return clientService.save(p);
    }
}
