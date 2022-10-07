package com.example.demo44.service;

import com.example.demo44.entities.Pruebas;
import com.example.demo44.entities.Reservation;
import com.example.demo44.repository.PruebasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PruebasService {
    @Autowired
    private PruebasRepository pruebasRepository;

    public List<Pruebas> getAll(){return  pruebasRepository.getAll(); }

    public Optional<Pruebas> getPruebas(int id){
        return pruebasRepository.getPruebas(id);
    }

    public  Pruebas save(Pruebas p){
        if (p.getId() == null){
            return  pruebasRepository.save(p);
        }else{
            Optional<Pruebas> e = pruebasRepository.getPruebas(p.getId());
            if (e.isPresent()){
                return p;
            }else{
                return pruebasRepository.save(p);
            }
        }
    }

    public Pruebas update(Pruebas p){
        if (p.getId() == null){
            Optional<Pruebas> q = pruebasRepository.getPruebas(p.getId());
            if (q.isPresent()){
                if (p.getName()!=null){
                    q.get().setName(p.getName());
                }

                if (p.getDescription()!=null){
                    q.get().setDescription(p.getDescription());
                }

                pruebasRepository.save(q.get());
                return  q.get();
            }else{
                return p;
            }
        }else{
            return p;
        }
    }

    public boolean delete(int id){
        boolean flag = false;
        Optional<Pruebas> p = pruebasRepository.getPruebas(id);

        if (p.isPresent()){
            pruebasRepository.delete(p.get());
            flag = true;
        }
        return flag;
    }

}
