package com.liquorsgolden.lq.infrastructure.repository.cartitem;

import com.liquorsgolden.lq.domain.entities.CartItem;
import com.liquorsgolden.lq.infrastructure.repository.cart.CartDtoMapper;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    CartDtoMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CartItemDtoMapper extends EntityToDto<CartItem, CartItemDto> {

}
