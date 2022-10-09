package com.example.demo44.controller;


import com.example.demo44.entities.Category;
import com.example.demo44.entities.Machine;
import com.example.demo44.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    @ResponseStatus(HttpStatus.CREATED)
    public  Machine save(@RequestBody Machine p){
        return machineService.save(p);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public  Machine update(@RequestBody Machine p){
        return machineService.update(p);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public  boolean delete(@PathVariable("id") int id){
        return machineService.delete(id);
    }
}
