package com.example.demo44.repository.crudRepository;

import com.example.demo44.entities.Category;
import com.example.demo44.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository <Reservation, Integer> {
}
