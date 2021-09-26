package com.goldenshoe.example.goldenshoeservice.controllers;

import com.goldenshoe.example.goldenshoeservice.models.ShoeModel;
import com.goldenshoe.example.goldenshoeservice.repositories.shoeModelRepository.ShoeModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(value = "/shoeModels")
public class ShoeModelController {
    @Autowired
    ShoeModelRepository shoeModelRepository;

    @GetMapping
    public List<ShoeModel> getAllShoeModels() {
        return shoeModelRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<ShoeModel> getShoeModelsById(@PathVariable Long id) {
        return shoeModelRepository.findById(id);
    }

    @GetMapping("gender/{gender}")
    public List<ShoeModel> getAllShoesByGender(@PathVariable String gender) {
        return shoeModelRepository.findAllShoesByGender(gender);
    }

    @GetMapping("category/{gender}/{category}")
    public List<ShoeModel> getAllShoesByGenderAndCategory(@PathVariable String gender, @PathVariable String category) {
        return shoeModelRepository.findAllShoesByGenderAndCategory(gender, category);
    }
}
