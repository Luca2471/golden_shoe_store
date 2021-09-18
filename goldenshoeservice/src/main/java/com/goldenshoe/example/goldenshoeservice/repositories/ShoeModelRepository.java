package com.goldenshoe.example.goldenshoeservice.repositories;

import com.goldenshoe.example.goldenshoeservice.models.ShoeModel;
import com.goldenshoe.example.goldenshoeservice.projections.EmbedShoeSize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedShoeSize.class)
public interface ShoeModelRepository extends JpaRepository<ShoeModel, Long> {
}
