package com.example.demo44.controller;


import com.example.demo44.entities.Library;
import com.example.demo44.entities.Machine;
import com.example.demo44.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Machine")
public class MachineController {

    @Autowired
    private MachineService machineService;

    @GetMapping("/all")
    public List<Machine> getAll(){
        return machineService.getAll();
    }

    @PostMapping("/save")
    public  Machine save(@RequestBody Machine p){
        return machineService.save(p);
    }
}
