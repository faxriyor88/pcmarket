package com.example.pcmarket.repository;

import com.example.pcmarket.custom.CharacteristicsCustom;
import com.example.pcmarket.entity.Characteristics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "characteristics",excerptProjection = CharacteristicsCustom.class)
public interface CharacteristicsRepository extends JpaRepository<Characteristics,Integer> {
}
