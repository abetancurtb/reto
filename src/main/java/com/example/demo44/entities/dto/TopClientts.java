package com.example.demo44.entities.dto;

import com.example.demo44.entities.Client;

public class TopClientts {

    private int total;
    private Client client;

    public TopClientts(int total, Client client){
        this.total=total;
        this.client=client;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
