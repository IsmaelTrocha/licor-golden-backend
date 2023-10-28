package com.liquorsgolden.lq.application.order;

import com.liquorsgolden.lq.domain.entities.Order;
import com.liquorsgolden.lq.domain.services.order.CreateOrderService;
import com.liquorsgolden.lq.infrastructure.api.dto.request.order.OrderRequest;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateOrderApplication {

    private final CreateOrderService createOrderService;

    public Order createOrder(Order order) {
        return createOrderService.createOrder(order);
    }
}
