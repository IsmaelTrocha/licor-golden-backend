package com.liquorsgolden.lq.infrastructure.repository.product;

import com.liquorsgolden.lq.infrastructure.repository.category.CategoryDto;
import com.liquorsgolden.lq.infrastructure.repository.status.StatusDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PRODUCTS")
@Entity
@Data
public class ProductDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String description;
  @Column(name = "image_url")
  private String imageUrl;
  private CategoryDto category;
  private Double price;
  private int stock;
  @ManyToOne
  @JoinColumn(name = "status_id")
  private StatusDto status;
  @Column(name = "created_date")
  private LocalDateTime createDate;
  @Column(name = "update_date")
  private LocalDateTime updateDate;
  @Column(name = "hide_date")
  private LocalDateTime hideDate;
  private LocalDateTime expirationDate;
}
