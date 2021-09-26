package com.goldenshoe.example.goldenshoeservice.repositories.shoeModelRepository;

import com.goldenshoe.example.goldenshoeservice.models.ShoeModel;

import java.util.List;

public interface ShoeModelRepositoryCustom {
    List<ShoeModel> findAllShoesByGenderAndCategory(String gender, String category);
}
