package com.liquorsgolden.lq.infrastructure.repository.cartitem;

import com.liquorsgolden.lq.infrastructure.repository.cart.CartDto;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductDto;
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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CART_ITEM")
public class CartItemDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "product_id")
  private ProductDto product;
  private int quantity;
  @Column(name = "insertion_date")
  private LocalDateTime insertionDate;
  @Column(name = "update_date")
  private LocalDateTime updateDate;
  @ManyToOne
  @JoinColumn(name = "cart_id")
  private CartDto cart;
}
