package com.sparta.msa.product.controller;

import com.sparta.msa.product.dto.ProductRequestDto;
import com.sparta.msa.product.dto.ProductResponeseDto;
import com.sparta.msa.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    //상품 추가 api
    @PostMapping
    public ProductResponeseDto createProduct(@RequestBody ProductRequestDto requestDto,
                                             ) {}

    //상품 목록 조회 api






}
