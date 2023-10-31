package com.liquorsgolden.lq.infrastructure.api.mapper.cartitem;

import com.liquorsgolden.lq.domain.entities.CartItem;
import com.liquorsgolden.lq.infrastructure.api.dto.request.cartitem.CartItemRequest;
import com.liquorsgolden.lq.infrastructure.api.mapper.cart.CartRequestMapper;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    CartRequestMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CartItemRequestMapper extends EntityToDto<CartItem, CartItemRequest> {

  @Mapping(source = "cartId",target = "cart.id")
  @Mapping(source = "productId",target = "product.id")
  CartItem toEntity(CartItemRequest cartItemRequest);
}
