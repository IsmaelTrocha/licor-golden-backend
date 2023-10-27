package com.liquorsgolden.lq.infrastructure.repository.shoppingcart.cartitem;

import com.liquorsgolden.lq.domain.entities.CartItem;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface CartItemDtoMapper extends EntityToDto<CartItem, CartItemDto> {

}
