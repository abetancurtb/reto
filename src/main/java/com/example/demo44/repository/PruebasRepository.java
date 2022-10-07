package com.example.demo44.repository;

import com.example.demo44.entities.Pruebas;
import com.example.demo44.entities.Reservation;
import com.example.demo44.repository.crudRepository.PruebasCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PruebasRepository {
    @Autowired
    private PruebasCrudRepository pruebasCrudRepository;

    public List<Pruebas> getAll(){
        return (List<Pruebas>) pruebasCrudRepository.findAll();
    }

    public Optional<Pruebas> getPruebas(int id){
        return pruebasCrudRepository.findById(id);
    }

    public  Pruebas save(Pruebas p){
        return pruebasCrudRepository.save(p);
    }

    public  void  delete(Pruebas p){
        pruebasCrudRepository.delete(p);
    }
}
