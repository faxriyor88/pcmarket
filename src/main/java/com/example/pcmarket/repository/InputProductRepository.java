package com.example.pcmarket.repository;

import com.example.pcmarket.custom.InputProductCustom;
import com.example.pcmarket.entity.InputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path ="inputproduct",excerptProjection = InputProductCustom.class)
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {
}
