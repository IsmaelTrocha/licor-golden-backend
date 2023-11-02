package com.liquorsgolden.lq.infrastructure.api.dto.response.order;

import com.liquorsgolden.lq.domain.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse {

    private Long id;
    private Long userId;
    private List<Product> products;
    private LocalDateTime creationOrder;
   // private LocalDateTime finishDate;
   // private LocalDateTime deliveryDate;
    private int quantity;
    private Double total;
//    private Long addressId;
    private Long statusId;

    public OrderResponse(Long id, Long id1, Double total) {

    }
}
