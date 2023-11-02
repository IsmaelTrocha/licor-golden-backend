package com.liquorsgolden.lq.infrastructure.api.mapper.shoppingcart;

import com.liquorsgolden.lq.domain.entities.CartItem;
import com.liquorsgolden.lq.infrastructure.api.dto.request.shoppingcart.ShoppingCartRequest;
import com.liquorsgolden.lq.infrastructure.api.mapper.customer.CustomerRequestMapper;
import com.liquorsgolden.lq.infrastructure.api.mapper.product.request.ProductRequestMapper;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    CustomerRequestMapper.class,
    ProductRequestMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ShoppingCartRequestMapper extends EntityToDto<CartItem, ShoppingCartRequest> {

}
