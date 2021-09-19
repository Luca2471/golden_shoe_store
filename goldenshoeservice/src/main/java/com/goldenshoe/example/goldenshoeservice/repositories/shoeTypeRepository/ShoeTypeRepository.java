package com.goldenshoe.example.goldenshoeservice.repositories.shoeTypeRepository;

import com.goldenshoe.example.goldenshoeservice.models.ShoeType;
import com.goldenshoe.example.goldenshoeservice.projections.EmbedShoeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedShoeModel.class)
public interface ShoeTypeRepository extends JpaRepository<ShoeType, Long> {
}
