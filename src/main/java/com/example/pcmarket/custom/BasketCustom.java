package com.example.pcmarket.custom;

import com.example.pcmarket.entity.Basket;
import com.example.pcmarket.entity.Product;
import com.example.pcmarket.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Basket.class)
public interface BasketCustom {
    Integer getId();
    User getUser();
    Product getProducts();
    String getOverall_amount();

}
