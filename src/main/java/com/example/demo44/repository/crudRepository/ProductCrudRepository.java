package com.example.demo44.repository.crudRepository;

import com.example.demo44.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository<Product,Integer> {
}
