package com.example.pcmarket.custom;

import com.example.pcmarket.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = User.class)
public interface UserCustom {
    Integer getId();

    String getName();

    String getAddress();

    String getPhone_number();

    String getEmail();

}
