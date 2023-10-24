package com.liquorsgolden.lq.domain.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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
  private LocalDateTime createDate;
  private LocalDateTime updateDate;
  private LocalDateTime hideDate;
  //Foreign keys
  private Category category;
  private Status status;
  private Proportion proportion;



}