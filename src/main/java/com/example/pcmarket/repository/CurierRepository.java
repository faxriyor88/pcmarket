package com.example.pcmarket.repository;

import com.example.pcmarket.custom.CurierCustom;
import com.example.pcmarket.entity.Curier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "curier",excerptProjection = CurierCustom.class)
public interface CurierRepository extends JpaRepository<Curier,Integer> {
}
