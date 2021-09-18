package com.goldenshoe.example.goldenshoeservice.repositories;

import com.goldenshoe.example.goldenshoeservice.models.ShoeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoeTypeRepository extends JpaRepository<ShoeType, Long> {
}
