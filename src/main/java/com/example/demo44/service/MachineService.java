package com.example.demo44.service;

import com.example.demo44.entities.Category;
import com.example.demo44.entities.Machine;
import com.example.demo44.repository.MachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MachineService {
    @Autowired
    private MachineRepository machineRepository;

    public List<Machine> getAll(){return  machineRepository.getAll(); }

    public Optional<Machine> getCategory(int id){
        return machineRepository.getMachine(id);
    }

    public  Machine save(Machine p){
        if (p.getID() == null){
            return  machineRepository.save(p);
        }else{
            Optional<Machine> e = machineRepository.getMachine(p.getID());
            if (e.isPresent()){
                return p;
            }else{
                return machineRepository.save(p);
            }
        }
    }


    public Machine update(Machine p){
        if (p.getID() != null){
            Optional<Machine> q = machineRepository.getMachine(p.getID());
            if (q.isPresent()){
                if (p.getName()!=null){
                    q.get().setName(p.getName());
                }

                if (p.getBrand()!=null){
                    q.get().setBrand(p.getBrand());
                }

                if (p.getYear()!=null){
                    q.get().setYear(p.getYear());
                }

                if (p.getDescription()!=null){
                    q.get().setDescription(p.getDescription());
                }

                if (p.getCategory()!=null){
                    q.get().setCategory(p.getCategory());
                }
                if (p.getMessages()!=null){
                    q.get().setMessages(p.getMessages());
                }
                if (p.getReservations()!=null){
                    q.get().setReservations(p.getReservations());
                }

                machineRepository.save(q.get());
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
        Optional<Machine> p = machineRepository.getMachine(id);

        if (p.isPresent()){
            machineRepository.delete(p.get());
            flag = true;
        }
        return flag;
    }

}
