package com.liquorsgolden.lq.infrastructure.api.controller;

import com.liquorsgolden.lq.application.shoppingcart.AddItemShoppingCartApplication;
import com.liquorsgolden.lq.application.shoppingcart.GetItemShoppingCartApplication;
import com.liquorsgolden.lq.application.shoppingcart.UpdateQuantityItemCartApplication;
import com.liquorsgolden.lq.infrastructure.adapter.shoppingcart.RemoveItemShoppingCartApplication;
import com.liquorsgolden.lq.infrastructure.api.dto.request.shoppingcart.ShoppingCartRequest;
import com.liquorsgolden.lq.infrastructure.api.dto.response.CreateResponse;
import com.liquorsgolden.lq.infrastructure.api.mapper.shoppingcart.ShoppingCartRequestMapper;
import com.liquorsgolden.lq.shared.utils.MessageUtils;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/shopping-cart")
@AllArgsConstructor
public class ShoppingCartController {

  private final AddItemShoppingCartApplication addItemShoppingCartApplication;
  private final GetItemShoppingCartApplication getItemShoppingCartApplication;
  private final RemoveItemShoppingCartApplication removeItemShoppingCartApplication;
  private final UpdateQuantityItemCartApplication updateQuantityItemCartApplication;
  private final ShoppingCartRequestMapper shoppingCartRequestMapper;
  private final MessageUtils messageUtils;

  @PostMapping
  public ResponseEntity<CreateResponse> createCart(
      @RequestBody ShoppingCartRequest shoppingCartRequest) {
    addItemShoppingCartApplication.addItemShoppingCart(
        shoppingCartRequestMapper.toEntity(shoppingCartRequest));
    return new ResponseEntity<>(
        new CreateResponse("",""),
        HttpStatus.CREATED);
  }


}
