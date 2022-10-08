package com.example.demo44.repository.crudRepository;

import com.example.demo44.entities.Machine;
import org.springframework.data.repository.CrudRepository;

public interface MachineCrudRepository extends CrudRepository <Machine, Integer> {
}
