package com.liquorsgolden.lq.infrastructure.repository.order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderDto,Long> {

}
