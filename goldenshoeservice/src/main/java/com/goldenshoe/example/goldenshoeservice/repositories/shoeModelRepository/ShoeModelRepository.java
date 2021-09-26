package com.goldenshoe.example.goldenshoeservice.repositories.shoeModelRepository;

import com.goldenshoe.example.goldenshoeservice.models.ShoeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ShoeModelRepository extends JpaRepository<ShoeModel, Long>, ShoeModelRepositoryCustom {
    List<ShoeModel> findAllShoesByGender(String gender);
    List<ShoeModel> findAllShoesByGenderAndCategory(String gender, String category);

}
