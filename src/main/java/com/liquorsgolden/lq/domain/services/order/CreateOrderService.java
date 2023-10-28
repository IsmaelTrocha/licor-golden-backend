package com.liquorsgolden.lq.domain.services.order;

import com.liquorsgolden.lq.domain.entities.Order;
import com.liquorsgolden.lq.infrastructure.api.dto.request.order.OrderRequest;

public interface CreateOrderService {

    Order createOrder(Order order);
}
