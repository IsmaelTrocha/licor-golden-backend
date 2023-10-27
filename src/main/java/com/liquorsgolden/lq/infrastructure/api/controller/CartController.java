package com.liquorsgolden.lq.infrastructure.api.controller;

import com.liquorsgolden.lq.infrastructure.repository.shoppingcart.cart.CartDto;
import com.liquorsgolden.lq.infrastructure.repository.shoppingcart.cart.CartRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/shopping-cart")
@AllArgsConstructor
public class CartController {

  private final CartRepository cartRepository;


  @PostMapping(path = "/create")
  public void createCart(@RequestBody CartDto cartDto) {
    cartRepository.save(cartDto);
  }

  @GetMapping(path = "/{id}")
  public CartDto getAll(@PathVariable("id") Long id) {
    return cartRepository.findById(id).orElse(null);
  }

}
