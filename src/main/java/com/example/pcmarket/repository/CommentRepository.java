package com.example.pcmarket.repository;

import com.example.pcmarket.custom.CommentCustom;
import com.example.pcmarket.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "custom",excerptProjection = CommentCustom.class)
public interface CommentRepository extends JpaRepository<Comment,Integer> {
}
