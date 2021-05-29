package com.example.pcmarket.repository;

import com.example.pcmarket.custom.UserCustom;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user",excerptProjection = UserCustom.class)
public interface UserRepository {
}
