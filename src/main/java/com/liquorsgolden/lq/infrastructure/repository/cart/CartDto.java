package com.liquorsgolden.lq.infrastructure.repository.cart;

import com.liquorsgolden.lq.infrastructure.repository.user.CustomerDto;
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

@Table(name = "CART")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CartDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "customer_id")
  private CustomerDto customer;
}
