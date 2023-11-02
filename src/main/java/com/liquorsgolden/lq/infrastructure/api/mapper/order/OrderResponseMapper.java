package com.liquorsgolden.lq.infrastructure.api.mapper.order;

import com.liquorsgolden.lq.domain.entities.Order;
import com.liquorsgolden.lq.infrastructure.api.dto.response.order.OrderResponse;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderResponseMapper extends EntityToDto<Order, OrderResponse> {

    OrderResponse toDto(Order order);
}
