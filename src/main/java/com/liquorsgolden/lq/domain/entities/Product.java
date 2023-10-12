package com.liquorsgolden.lq.domain.entities;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

  private Long id;
  private String nameProduct;
  private String description;
  private String imageUrl;
  private Double price;
  private int stock;
  //Foreign keys
  private Category category;
  private Status status;


/*
  private LocalDateTime createDate;
  private LocalDateTime updateDate;
  private LocalDateTime hideDate;
*/
}