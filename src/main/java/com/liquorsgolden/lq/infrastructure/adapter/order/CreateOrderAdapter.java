package com.liquorsgolden.lq.infrastructure.adapter.order;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.order.CreateOrderService;
import com.liquorsgolden.lq.domain.services.product.ProductUpdateService;
import com.liquorsgolden.lq.infrastructure.api.dto.request.order.OrderRequest;
import com.liquorsgolden.lq.infrastructure.repository.order.OrderDto;
import com.liquorsgolden.lq.infrastructure.repository.order.OrderDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.order.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import com.liquorsgolden.lq.domain.entities.Order;

import java.time.LocalDateTime;

@AllArgsConstructor
@Repository
public class CreateOrderAdapter implements CreateOrderService {

    private final OrderRepository orderRepository;
    private final ProductUpdateService productUpdateService;
    private final OrderDtoMapper orderDtoMapper;

    @Override
    public Order createOrder(Order order) {
        double total = 0.0; // Inicializar el total en 0
        for (Product product : order.getProducts()) {
            int orderedQuantity = product.getQuantity();
            int currentStock = product.getStock();
            product.setStock(currentStock - orderedQuantity);
            productUpdateService.updateProduct(product);
            // Sumar el precio del producto al total
            total += (product.getPrice() * orderedQuantity);
        }
        order.setTotal(total); // Establecer el total en la orden
        order.setCreationOrder(LocalDateTime.now());
        return orderDtoMapper.toEntity(orderRepository.save(orderDtoMapper.toDto(order)));
    }
}
