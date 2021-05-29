package com.example.pcmarket.custom;

import com.example.pcmarket.entity.Curier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Curier.class)
public interface CurierCustom {
    Integer getId();
    String getFullname();
    String getEmail();
    String getMessage();
}
