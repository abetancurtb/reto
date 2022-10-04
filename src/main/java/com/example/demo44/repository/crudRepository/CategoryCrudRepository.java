package com.example.demo44.repository.crudRepository;

import com.example.demo44.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrudRepository extends CrudRepository <Category, Integer> {
}
