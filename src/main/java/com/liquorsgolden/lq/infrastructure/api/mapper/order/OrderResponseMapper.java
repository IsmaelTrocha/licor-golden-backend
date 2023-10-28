package com.liquorsgolden.lq.infrastructure.api.mapper.order;

import com.liquorsgolden.lq.domain.entities.Order;
import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.infrastructure.api.dto.response.order.OrderResponse;
import com.liquorsgolden.lq.infrastructure.api.dto.response.product.ProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderResponseMapper {

    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "status.id", target = "statusId")
    OrderResponse toDto(Order order);
}
