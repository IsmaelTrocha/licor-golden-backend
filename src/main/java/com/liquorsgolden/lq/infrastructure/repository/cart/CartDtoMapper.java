package com.liquorsgolden.lq.infrastructure.repository.cart;

import com.liquorsgolden.lq.domain.entities.Cart;
import com.liquorsgolden.lq.infrastructure.repository.user.CustomerDtoMapper;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    CustomerDtoMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CartDtoMapper extends EntityToDto<Cart, CartDto> {

}
