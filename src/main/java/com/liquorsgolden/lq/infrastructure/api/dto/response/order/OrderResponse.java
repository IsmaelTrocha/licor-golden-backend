package com.liquorsgolden.lq.infrastructure.api.dto.response.order;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.infrastructure.api.dto.response.CustomerResponse;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse {

  private Long id;
  private CustomerResponse customer;
  private List<Product> products;
  private LocalDateTime creationOrder;
  // private LocalDateTime finishDate;
  // private LocalDateTime deliveryDate;
  private int quantity;
  private Double total;
  //    private Long addressId;
  private Long statusId;


}
