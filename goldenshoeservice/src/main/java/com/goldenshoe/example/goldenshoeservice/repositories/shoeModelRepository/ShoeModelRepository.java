package com.goldenshoe.example.goldenshoeservice.repositories.shoeModelRepository;

import com.goldenshoe.example.goldenshoeservice.models.ShoeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ShoeModelRepository extends JpaRepository<ShoeModel, Long> {
}
