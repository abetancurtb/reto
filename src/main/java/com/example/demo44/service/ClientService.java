package com.example.demo44.service;

import com.example.demo44.entities.Client;
import com.example.demo44.entities.Library;
import com.example.demo44.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll(){return  clientRepository.getAll(); }

    public Optional<Client> getClient(int id){
        return clientRepository.getClient(id);
    }

    public  Client save(Client p){
        if (p.getId() == null){
            return  clientRepository.save(p);
        }else{
            Optional<Client> e = clientRepository.getClient(p.getId());
            if (e.isPresent()){
                return p;
            }else{
                return clientRepository.save(p);
            }
        }
    }

    public Client update(Client p){
        if (p.getId() == null){
            Optional<Client> q = clientRepository.getClient(p.getId());
            if (q.isPresent()){
                if (p.getName()!=null){
                    q.get().setName(p.getName());
                }
                if (p.getAge()!=null){
                    q.get().setAge(p.getAge());
                }
                if (p.getPassword()!=null){
                    q.get().setPassword(p.getPassword());
                }
                if (p.getEmail()!=null){
                    q.get().setEmail(p.getEmail());
                }
                if (p.getReservations()!=null){
                    q.get().setReservations(p.getReservations());
                }
                if (p.getMessages()!=null){
                    q.get().setMessages(p.getMessages());
                }

                clientRepository.save(q.get());
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
        Optional<Client> p = clientRepository.getClient(id);

        if (p.isPresent()){
            clientRepository.delete(p.get());
            flag = true;
        }
        return flag;
    }

}
