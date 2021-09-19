package com.goldenshoe.example.goldenshoeservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shoeModels")
public class ShoeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "color")
    private String color;

    @Column(name = "price")
    private String price;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "shoeURL")
    private String shoeURL;


    @JsonIgnoreProperties("shoeModel")
    @ManyToOne
    @JoinColumn(name = "shoeType_id", nullable = false)
    private ShoeType shoeType;

    @Column(name = "gender")
    private String gender;

    public ShoeModel(String model, String color, String price, int quantity, String shoeURL, ShoeType shoeType, String gender) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.shoeURL = shoeURL;
        this.shoeType = shoeType;
        this.gender = gender;
    }

    public ShoeModel() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getShoeURL() {
        return shoeURL;
    }

    public void setShoeURL(String shoeURL) {
        this.shoeURL = shoeURL;
    }

    public ShoeType getShoeType() {
        return shoeType;
    }

    public void setShoeType(ShoeType shoeType) {
        this.shoeType = shoeType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
