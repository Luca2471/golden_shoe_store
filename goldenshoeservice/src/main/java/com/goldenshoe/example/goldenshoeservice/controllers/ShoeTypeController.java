package com.goldenshoe.example.goldenshoeservice.controllers;

import com.goldenshoe.example.goldenshoeservice.models.ShoeType;
import com.goldenshoe.example.goldenshoeservice.repositories.ShoeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/shoeTypes")
public class ShoeTypeController {

    @Autowired
    ShoeTypeRepository shoeTypeRepository;

    @GetMapping
    public List<ShoeType> getAllShoeSizes() {
        return shoeTypeRepository.findAll();
    }
}
