package com.example.demo44.repository.crudRepository;

import com.example.demo44.entities.Category;
import com.example.demo44.entities.Library;
import org.springframework.data.repository.CrudRepository;

public interface LibraryCrudRepository extends CrudRepository <Library, Integer> {
}
