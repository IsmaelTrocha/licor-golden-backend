package com.liquorsgolden.lq.infrastructure.repository.shoppingcart;

import com.liquorsgolden.lq.domain.entities.ShoppingCart;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface ShoppingCartDtoMapper extends EntityToDto<ShoppingCart,ShoppingCartDto> {

}
