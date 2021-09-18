package com.goldenshoe.example.goldenshoeservice.projections;

import com.goldenshoe.example.goldenshoeservice.models.ShoeSize;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedShoeSize", types = ShoeSize.class)
public interface EmbedShoeSize {
}
