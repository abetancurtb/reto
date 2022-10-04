package com.example.demo44.repository;

import com.example.demo44.entities.Category;
import com.example.demo44.repository.crudRepository.CategoryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Repository
public class CategoryRepository {
    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    public List<Category> getAll(){
        return (List<Category>) categoryCrudRepository.findAll();
    }

    public Optional<Category> getCategory(int id){
        return categoryCrudRepository.findById(id);
    }

    public  Category save(Category c){
        return categoryCrudRepository.save(c);
    }

    public void delete(Category c){
        categoryCrudRepository.delete(c);
    }
}
