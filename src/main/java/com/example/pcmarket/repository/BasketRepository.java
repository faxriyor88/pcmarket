package com.example.pcmarket.repository;

import com.example.pcmarket.custom.BasketCustom;
import com.example.pcmarket.entity.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "basket",excerptProjection = BasketCustom.class )
public interface BasketRepository extends JpaRepository<Basket,Integer> {
}
