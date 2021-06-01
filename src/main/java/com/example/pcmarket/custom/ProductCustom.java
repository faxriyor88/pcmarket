package com.example.pcmarket.custom;

import com.example.pcmarket.entity.Attachment;
import com.example.pcmarket.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface ProductCustom {
    Integer getId();
    Integer getPrice();
    String getInfo();
    String getName();
    String getGuarantee();
    Attachment getAttachment();
}
