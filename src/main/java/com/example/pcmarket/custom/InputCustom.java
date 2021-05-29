package com.example.pcmarket.custom;

import com.example.pcmarket.entity.Input;
import com.example.pcmarket.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;

@Projection(types = Input.class)
public interface InputCustom {
    Integer getId();
    String getCode();
    String getFacture_number();
    LocalDate getDate();
    Supplier getSupplier();
}
