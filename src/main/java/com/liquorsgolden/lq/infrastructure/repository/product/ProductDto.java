package com.liquorsgolden.lq.infrastructure.repository.product;

import com.liquorsgolden.lq.infrastructure.repository.category.CategoryDto;
import com.liquorsgolden.lq.infrastructure.repository.proportion.ProportionDto;
import com.liquorsgolden.lq.infrastructure.repository.status.StatusDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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

  @ManyToOne
  @JoinColumn(name = "category_id", referencedColumnName = "id")
  private CategoryDto category;

  @ManyToOne
  @JoinColumn(name = "status_id", referencedColumnName = "id")
  private StatusDto status;

  @ManyToOne
  @JoinColumn(name = "proportion_id", referencedColumnName = "id")
  private ProportionDto proportion;

  @Column(name = "name_product", unique=true)
  private String nameProduct;
  @Column(name = "description")
  private String description;
  @Column(name = "image_url")
  private String imageUrl;
  @Column(name = "price")
  private Double price;
  @Column(name = "stock")
  private int stock;
  /*
  @Column(name = "created_date")
  private LocalDateTime createDate;
  @Column(name = "update_date")
  private LocalDateTime updateDate;
  @Column(name = "hide_date")
  private LocalDateTime hideDate;
  private LocalDateTime expirationDate;
  */
}
