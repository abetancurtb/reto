package com.example.demo44.repository.crudRepository;

import com.example.demo44.entities.Cate;
import com.example.demo44.entities.Pruebas;
import org.springframework.data.repository.CrudRepository;

public interface CateCrudRepository extends CrudRepository <Cate, Integer> {
}
