package com.goldenshoe.example.goldenshoeservice.projections;

import com.goldenshoe.example.goldenshoeservice.models.ShoeModel;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedShoeModel", types = ShoeModel.class)
public interface EmbedShoeModel{
}
