package com.liquorsgolden.lq.infrastructure.adapter.order;

import com.liquorsgolden.lq.domain.entities.Order;
import com.liquorsgolden.lq.domain.services.order.CreateOrderService;
import com.liquorsgolden.lq.domain.services.product.GetProductByIdService;
import com.liquorsgolden.lq.domain.services.product.ProductUpdateService;
import com.liquorsgolden.lq.infrastructure.repository.order.OrderDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.order.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CreateOrderAdapter implements CreateOrderService {

    private final OrderRepository orderRepository;
    private final ProductUpdateService productUpdateService; // Cambiado a ProductService para validar productos
    private final GetProductByIdService getProductByIdService;
    private final OrderDtoMapper orderDtoMapper;

    @Override
    public Order createOrder(Order order) {

        return orderDtoMapper.toEntity(orderRepository.save(orderDtoMapper.toDto(order)));
    }
}
