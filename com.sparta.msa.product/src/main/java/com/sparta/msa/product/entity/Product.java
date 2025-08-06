package com.sparta.msa.product.entity;

import com.sparta.msa.product.dto.ProductResponeseDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name ="product")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String price;
    private Integer quantity;

    public ProductResponeseDto responeseDto() {
        return new ProductResponeseDto(
                this.id,
                this.name,
                this.description,
                this.price,
                this.quantity
        );
    }


}
