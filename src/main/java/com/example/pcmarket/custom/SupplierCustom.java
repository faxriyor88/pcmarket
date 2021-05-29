package com.example.pcmarket.custom;

import com.example.pcmarket.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface SupplierCustom {
    Integer getId();
    String getName();
    String getPhone_number();
    String getEmail();

}
