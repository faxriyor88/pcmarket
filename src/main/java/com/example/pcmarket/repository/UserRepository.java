package com.example.pcmarket.repository;

import com.example.pcmarket.custom.UserCustom;
import com.example.pcmarket.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user",excerptProjection = UserCustom.class)
public interface UserRepository extends JpaRepository<User,Integer> {
}
