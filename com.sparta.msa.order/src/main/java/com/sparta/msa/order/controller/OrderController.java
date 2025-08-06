package com.sparta.msa.order.controller;

import com.sparta.msa.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/order/{orderId}")
    public String getOrder (@PathVariable String orderId) {
        return orderService.getOrder(orderId);
    }

    //주문 추가 api

    //주문 추가 api 실패 케이스

    //주문 단건 조회 api
}
