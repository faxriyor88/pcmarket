package com.example.pcmarket.custom;

import com.example.pcmarket.entity.Product;
import com.example.pcmarket.entity.User;
import org.springframework.data.rest.core.config.Projection;
import com.example.pcmarket.entity.Comment;

@Projection(types = Comment.class)
public interface CommentCustom {
    Integer getId();
    String getText();
    Product getProduct();
    User getUser();
}
