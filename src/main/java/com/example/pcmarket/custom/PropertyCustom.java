package com.example.pcmarket.custom;

import com.example.pcmarket.entity.Characteristics;
import com.example.pcmarket.entity.Property;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Property.class)
public interface PropertyCustom {
    Integer getId();
    String getName();
    Characteristics getCharacteristics();

}
