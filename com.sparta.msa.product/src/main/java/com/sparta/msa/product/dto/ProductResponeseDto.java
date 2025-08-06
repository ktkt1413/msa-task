package com.sparta.msa.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductResponeseDto {

    private Long id;
    private String name;
    private String description;
    private String price;
    private Integer quantity;
}
