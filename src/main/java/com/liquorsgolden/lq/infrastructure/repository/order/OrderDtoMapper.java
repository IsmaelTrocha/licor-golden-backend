package com.liquorsgolden.lq.infrastructure.repository.order;

import com.liquorsgolden.lq.domain.entities.Order;
import com.liquorsgolden.lq.infrastructure.repository.order.OrderDto;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;

public interface OrderDtoMapper extends EntityToDto<Order, OrderDto> {

}
