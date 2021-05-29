package com.example.pcmarket.custom;

import com.example.pcmarket.entity.Basket;
import com.example.pcmarket.entity.Order;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;

@Projection(types = Order.class)
public interface OrderCustom {
    Integer getId();
    Basket getBasket();
    LocalDate getDate();
    String getDetail();
    boolean getIs_active();
}
