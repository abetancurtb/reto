package com.example.demo44.repository;

import com.example.demo44.entities.Category;
import com.example.demo44.entities.Library;
import com.example.demo44.repository.crudRepository.LibraryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LibraryRepository {
    @Autowired
    private LibraryCrudRepository libraryCrudRepository;

    public List<Library> getAll(){
        return (List<Library>) libraryCrudRepository.findAll();
    }

    public Optional<Library> getLibrary(int id){
        return libraryCrudRepository.findById(id);
    }

    public  Library save(Library c){
        return libraryCrudRepository.save(c);
    }

    public void delete(Library c){
        libraryCrudRepository.delete(c);
    }
}
