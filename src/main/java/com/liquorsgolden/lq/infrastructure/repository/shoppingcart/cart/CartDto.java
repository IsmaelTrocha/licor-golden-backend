package com.liquorsgolden.lq.infrastructure.repository.shoppingcart.cart;

import com.liquorsgolden.lq.infrastructure.repository.product.ProductDto;
import com.liquorsgolden.lq.infrastructure.repository.shoppingcart.cartitem.CartItemDto;
import com.liquorsgolden.lq.infrastructure.repository.user.CustomerDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cart")
public class CartDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @OneToOne
  private CustomerDto customer;
  @OneToMany(mappedBy = "cart")
  private List<CartItemDto> cartItems;

}
