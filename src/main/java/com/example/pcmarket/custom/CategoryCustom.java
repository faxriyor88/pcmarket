package com.example.pcmarket.custom;

import com.example.pcmarket.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CategoryCustom {
    Integer getId();
    String getName();
    Category getParent_category_id();
}
