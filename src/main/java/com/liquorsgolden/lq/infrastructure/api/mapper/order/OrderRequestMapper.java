package com.liquorsgolden.lq.infrastructure.api.mapper.order;

import com.liquorsgolden.lq.domain.entities.Order;
import com.liquorsgolden.lq.infrastructure.api.dto.request.order.OrderRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderRequestMapper {

  @Mapping(source = "userId", target = "customer.id")
  @Mapping(source = "statusId", target = "status.id")
  @Mapping(source = "addressId", target = "address.id")
  @Mapping(source = "products", target = "productIds")
    // Mapear a "productIds" en lugar de "products"
  Order toEntity(OrderRequest orderRequest);
}
