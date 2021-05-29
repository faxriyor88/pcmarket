package com.example.pcmarket.custom;

import com.example.pcmarket.entity.Basket;
import com.example.pcmarket.entity.OutPutProduct;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OutPutProduct.class)
public interface OutPutProductCustom {
    Integer getId();
    Basket getBasket();
}
