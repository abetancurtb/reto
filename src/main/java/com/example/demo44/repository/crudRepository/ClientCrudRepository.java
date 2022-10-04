package com.example.demo44.repository.crudRepository;

import com.example.demo44.entities.Client;
import com.example.demo44.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<Client,Integer> {
}
