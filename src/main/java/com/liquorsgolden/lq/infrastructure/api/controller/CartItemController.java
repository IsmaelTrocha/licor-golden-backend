package com.liquorsgolden.lq.infrastructure.api.controller;

import com.liquorsgolden.lq.application.cartitem.AddCartItemApplication;
import com.liquorsgolden.lq.infrastructure.api.dto.request.cartitem.CartItemRequest;
import com.liquorsgolden.lq.infrastructure.api.mapper.cartitem.CartItemRequestMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/cart-items")
@AllArgsConstructor
public class CartItemController {

  private final AddCartItemApplication addCartItemApplication;
  private final CartItemRequestMapper cartItemRequestMapper;

  @PostMapping
  public ResponseEntity<String> addCartItem(@RequestBody CartItemRequest cartItemRequest) {
    addCartItemApplication.addCartItem(cartItemRequestMapper.toEntity(cartItemRequest));
    return new ResponseEntity<>("Item added to the car successfully.", HttpStatus.CREATED);
  }
}
