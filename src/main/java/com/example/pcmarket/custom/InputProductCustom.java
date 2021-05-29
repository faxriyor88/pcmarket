package com.example.pcmarket.custom;

import com.example.pcmarket.entity.Input;
import com.example.pcmarket.entity.InputProduct;
import com.example.pcmarket.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;

@Projection(types = InputProduct.class)
public interface InputProductCustom {
    Integer getId();
    String getAmount();
    String getPrice();
    LocalDate getExpire_date();
    Input getInput();
    Product getProduct_id();
}
