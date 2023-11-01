package com.liquorsgolden.lq.infrastructure.adapter.order;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.order.CreateOrderService;
import com.liquorsgolden.lq.domain.services.product.GetProductByIdService;
import com.liquorsgolden.lq.domain.services.product.ProductUpdateService;
import com.liquorsgolden.lq.infrastructure.repository.order.OrderDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.order.OrderRepository;
import com.liquorsgolden.lq.shared.exception.message.product.ProductNotFoundException;
import lombok.AllArgsConstructor;
import com.liquorsgolden.lq.domain.entities.Order;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@AllArgsConstructor
@Service
public class CreateOrderAdapter implements CreateOrderService {

    private final OrderRepository orderRepository;
    private final ProductUpdateService productUpdateService; // Cambiado a ProductService para validar productos
    private final GetProductByIdService getProductByIdService;
    private final OrderDtoMapper orderDtoMapper;

    @Override
    public Order createOrder(Order order) {
        double total = 0.0; // Inicializar el total en 0
        for (Long productId : order.getProductIds()) {
            Product product = getProductByIdService.getProduct(productId);
            if (product == null) {
                // Manejar el caso donde el producto no existe
                // Puedes lanzar una excepción, registrar un error, etc.
                // Por ejemplo:
                throw new ProductNotFoundException("Producto no encontrado: " + productId);
            }

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
