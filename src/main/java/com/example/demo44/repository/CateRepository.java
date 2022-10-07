package com.example.demo44.repository;

import com.example.demo44.entities.Cate;
import com.example.demo44.entities.Pruebas;
import com.example.demo44.repository.crudRepository.CateCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CateRepository {
    @Autowired
    private CateCrudRepository cateCrudRepository;

    public List<Cate> getAll(){
        return (List<Cate>) cateCrudRepository.findAll();
    }

    public Optional<Cate> getCate(int id){
        return cateCrudRepository.findById(id);
    }

    public  Cate save(Cate p){
        return cateCrudRepository.save(p);
    }

    public  void  delete(Cate p){
        cateCrudRepository.delete(p);
    }
}
