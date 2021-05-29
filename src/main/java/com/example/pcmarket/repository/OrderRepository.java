package com.example.pcmarket.repository;

import com.example.pcmarket.custom.OrderCustom;
import com.example.pcmarket.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "order",excerptProjection = OrderCustom.class)
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
