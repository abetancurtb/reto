package com.example.demo44.service;

import com.example.demo44.entities.Cate;
import com.example.demo44.entities.Pruebas;
import com.example.demo44.repository.CateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CateService {
    @Autowired
    private CateRepository cateRepository;

    public List<Cate> getAll(){return  cateRepository.getAll(); }

    public Optional<Cate> getPruebas(int id){
        return cateRepository.getCate(id);
    }

    public  Cate save(Cate p){
        if (p.getId() == null){
            return  cateRepository.save(p);
        }else{
            Optional<Cate> e = cateRepository.getCate(p.getId());
            if (e.isPresent()){
                return p;
            }else{
                return cateRepository.save(p);
            }
        }
    }

    public Cate update(Cate p){
        if (p.getId() == null){
            Optional<Cate> q = cateRepository.getCate(p.getId());
            if (q.isPresent()){
                if (p.getName()!=null){
                    q.get().setName(p.getName());
                }

                if (p.getPruebas()!=null){
                    q.get().setPruebas(p.getPruebas());
                }

                if (p.getBrand()!=null){
                    q.get().setBrand(p.getBrand());
                }

                if (p.getDescription()!=null){
                    q.get().setDescription(p.getDescription());
                }

                if (p.getYear()!=null){
                    q.get().setYear(p.getYear());
                }

                cateRepository.save(q.get());
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
        Optional<Cate> p = cateRepository.getCate(id);

        if (p.isPresent()){
            cateRepository.delete(p.get());
            flag = true;
        }
        return flag;
    }

}
