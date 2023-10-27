package com.liquorsgolden.lq.infrastructure.repository.shoppingcart;

import com.liquorsgolden.lq.infrastructure.repository.product.ProductDto;
import com.liquorsgolden.lq.infrastructure.repository.user.CustomerDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "shopping_cart")
public class ShoppingCartDto {

  private Long id;
  @OneToOne
  private CustomerDto customer;
  @OneToOne
  private ProductDto product;
  private int quantity;
  @Column(name = "insertion_date")
  private LocalDateTime insertionDate;
  @Column(name = "update_date")
  private LocalDateTime updateDate;

}
