package com.sparta.msa.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductRequestDto {

    private String name;
    private String description;
    private String price;
    private Integer quantity;
}
