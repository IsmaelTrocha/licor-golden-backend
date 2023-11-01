package com.liquorsgolden.lq.infrastructure.repository.cart;

import com.liquorsgolden.lq.domain.entities.Cart;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface CartDtoMapper extends EntityToDto<Cart, CartDto> {

}
