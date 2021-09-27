package com.goldenshoe.example.goldenshoeservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shoeTypes")
public class ShoeType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category")
    private String category;

    @JsonIgnoreProperties("shoeType")
    @OneToMany(mappedBy = "shoeType")
    private List<ShoeModel> shoeModels;

    public ShoeType(String category) {
        this.category = category;
        this.shoeModels = new ArrayList<>();
    }

    public ShoeType() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<ShoeModel> getShoeModels() {
        return shoeModels;
    }

    public void setShoeModels(List<ShoeModel> shoeModels) {
        this.shoeModels = shoeModels;
    }
}
