package com.goldenshoe.example.goldenshoeservice.controllers;

import com.goldenshoe.example.goldenshoeservice.models.ShoeSize;
import com.goldenshoe.example.goldenshoeservice.repositories.ShoeSizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/shoeSizes")
public class ShoeSizeController {
    @Autowired
    ShoeSizeRepository shoeSizeRepository;

    @GetMapping
    public List<ShoeSize> getAllShoeSizes() {
        return shoeSizeRepository.findAll();
    }
}
