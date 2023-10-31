package com.liquorsgolden.lq.infrastructure.api.controller;

import com.liquorsgolden.lq.application.cart.AddShoppingCartApplication;
import com.liquorsgolden.lq.infrastructure.api.mapper.cart.CartRequest;
import com.liquorsgolden.lq.infrastructure.api.mapper.cart.CartRequestMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/shopping-cart")
public class CartController {

  private final AddShoppingCartApplication addShoppingCartApplication;
  private final CartRequestMapper cartRequestMapper;

  @PostMapping
  public ResponseEntity<String> createShoppingCart(@RequestBody CartRequest cartRequest) {
    addShoppingCartApplication.addCart(cartRequestMapper.toEntity(cartRequest));
    return new ResponseEntity<>("Shopping cart was created Successfully.", HttpStatus.CREATED);
  }

}
