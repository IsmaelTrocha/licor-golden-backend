package com.liquorsgolden.lq.domain.entities;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class Category {

  private Long id;
  private String name;
  private String createBy;
  private LocalDateTime creationDate;

}
