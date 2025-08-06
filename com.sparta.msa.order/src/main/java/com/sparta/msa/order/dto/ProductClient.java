package com.sparta.msa.order.dto;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "product-service")
public interface ProductClient {
    @GetMapping("/products/{id}")
    String getProduct(@PathVariable("id") String id);

    @GetMapping("/products/{id}/reductQuantity")
    void reduceQuantity(@PathVariable("id")Long id, @RequestParam("quantity") int quantity);
}
