package com.goldenshoe.example.goldenshoeservice.controllers;

import com.goldenshoe.example.goldenshoeservice.models.ShoeType;
import com.goldenshoe.example.goldenshoeservice.repositories.shoeTypeRepository.ShoeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("{id}")
    public Optional<ShoeType> getShoeTypeById(@PathVariable Long id) {
        return shoeTypeRepository.findById(id);
    }

    @GetMapping("category/{category}")
    public List<ShoeType> getAllShoesByCategory(@PathVariable String category) {
        return shoeTypeRepository.findAllShoesByCategory(category);
    }

}
