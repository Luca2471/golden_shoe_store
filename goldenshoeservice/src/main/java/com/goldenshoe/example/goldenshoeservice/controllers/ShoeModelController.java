package com.goldenshoe.example.goldenshoeservice.controllers;

import com.goldenshoe.example.goldenshoeservice.models.ShoeModel;
import com.goldenshoe.example.goldenshoeservice.repositories.ShoeModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/shoemodels")
public class ShoeModelController {
    @Autowired
    ShoeModelRepository shoeModelRepository;

    @GetMapping
    public List<ShoeModel> getAllShoeModels() {
        return shoeModelRepository.findAll();
    }
}
