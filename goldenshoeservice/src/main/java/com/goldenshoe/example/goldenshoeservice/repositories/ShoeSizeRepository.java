package com.goldenshoe.example.goldenshoeservice.repositories;

import com.goldenshoe.example.goldenshoeservice.models.ShoeSize;
import com.goldenshoe.example.goldenshoeservice.projections.EmbedShoeSize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoeSizeRepository extends JpaRepository<ShoeSize, Long> {
}
