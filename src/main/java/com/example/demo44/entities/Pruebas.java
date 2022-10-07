package com.example.demo44.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "pruebas")
public class Pruebas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    private String description;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "pruebas")
    @JsonIgnoreProperties("pruebas")
    private List<Cate> cates;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Cate> getCates() {
        return cates;
    }

    public void setCates(List<Cate> cates) {
        this.cates = cates;
    }
}
