package com.liquorsgolden.lq.domain.entities;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

  private Long id;
  private Customer customer;
  private Product product;
  private LocalDateTime creationOrder;
  private LocalDateTime finishDate;
  private LocalDateTime deliveryDate;
  private int quantity;
  private Double total;
  private Address address;
  private Status status;

}
