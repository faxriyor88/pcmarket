package com.example.pcmarket.repository;

import com.example.pcmarket.custom.OutPutProductCustom;
import com.example.pcmarket.entity.OutPutProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "outputproduct",excerptProjection = OutPutProductCustom.class)
public interface OutPutProductRepository extends JpaRepository<OutPutProduct,Integer> {
}
