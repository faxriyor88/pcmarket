package com.example.pcmarket.repository;

import com.example.pcmarket.custom.PropertyCustom;

import com.example.pcmarket.entity.Product;
import com.example.pcmarket.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "property",excerptProjection = PropertyCustom.class)
public interface PropertyRepository extends JpaRepository<Property,Integer> {

}
