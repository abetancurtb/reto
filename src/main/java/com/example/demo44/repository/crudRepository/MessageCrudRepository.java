package com.example.demo44.repository.crudRepository;

import com.example.demo44.entities.Library;
import com.example.demo44.entities.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository <Message, Integer> {
}
