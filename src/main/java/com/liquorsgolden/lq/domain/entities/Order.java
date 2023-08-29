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
  private LocalDateTime creationDate;
  private Double total;
  private User user;
  private Product product;
  private int quantity;
  private Address address;
  private String status;

}
