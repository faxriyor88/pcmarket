package com.example.pcmarket.custom;

import com.example.pcmarket.entity.Characteristics;
import com.example.pcmarket.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Characteristics.class)
public interface CharacteristicsCustom {
    Integer getId();
    String getName();
    Product getProduct();
}
