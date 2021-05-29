package com.example.pcmarket.repository;

import com.example.pcmarket.custom.PropertyCustom;
import com.example.pcmarket.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "property",excerptProjection = PropertyCustom.class)
public interface PropertyRepository extends JpaRepository<Product,Integer> {
}
