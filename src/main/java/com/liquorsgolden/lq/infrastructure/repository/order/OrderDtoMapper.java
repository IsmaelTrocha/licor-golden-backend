package com.liquorsgolden.lq.infrastructure.repository.order;

import com.liquorsgolden.lq.domain.entities.Order;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface OrderDtoMapper extends EntityToDto<Order, OrderDto> {

}
