package com.liquorsgolden.lq.infrastructure.api.controller;

import com.liquorsgolden.lq.application.order.CreateOrderApplication;
import com.liquorsgolden.lq.infrastructure.api.dto.request.order.OrderRequest;
import com.liquorsgolden.lq.infrastructure.api.dto.response.order.OrderResponse;
import com.liquorsgolden.lq.infrastructure.api.mapper.order.OrderRequestMapper;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/order")
public class OrderController {

    private final CreateOrderApplication createOrderApplication;
    private final OrderRequestMapper orderRequestMapper;

    @PostMapping("/create")
    public ResponseEntity<OrderResponse> createOrder(@Valid @RequestBody OrderRequest orderRequest) {
        Order orderToUpdate = orderRequestMapper.toEntity(orderRequest);
        Order savedOrder = createOrderApplication.createOrder(orderToUpdate);



        return new ResponseEntity<>(new OrderResponse(), HttpStatus.CREATED);
    }
}
