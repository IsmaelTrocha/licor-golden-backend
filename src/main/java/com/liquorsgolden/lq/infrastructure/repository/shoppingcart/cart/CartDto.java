package com.liquorsgolden.lq.infrastructure.repository.shoppingcart.cart;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.liquorsgolden.lq.infrastructure.repository.cartitem.CartItemDto;
import com.liquorsgolden.lq.infrastructure.repository.user.CustomerDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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