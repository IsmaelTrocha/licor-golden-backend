package com.liquorsgolden.lq.infrastructure.repository.shoppingcart.cart;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.liquorsgolden.lq.infrastructure.repository.cartitem.CartItemDto;
import com.liquorsgolden.lq.infrastructure.repository.user.CustomerDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CART")
public class CartDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @OneToOne
  @JoinColumn(name = "customer_id")
  private CustomerDto customer;
  @OneToMany(mappedBy = "cart")
  @JsonManagedReference
  private List<CartItemDto> cartItems;

}
