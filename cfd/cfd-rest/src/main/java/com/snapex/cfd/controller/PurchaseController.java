package com.snapex.cfd.controller;


import com.snapex.cfd.vo.OrderVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/cfd")
public class PurchaseController {

    @GetMapping("/orders/{orderId}")
    public OrderVO view(@PathVariable String orderId) {
        return OrderVO.builder().code(UUID.randomUUID().toString()).orderId(orderId).build();
    }

}