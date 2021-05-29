package com.example.pcmarket.repository;

import com.example.pcmarket.custom.InputCustom;
import com.example.pcmarket.entity.Input;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input",excerptProjection = InputCustom.class)
public interface InputRepository extends JpaRepository<Input,Integer> {
}
