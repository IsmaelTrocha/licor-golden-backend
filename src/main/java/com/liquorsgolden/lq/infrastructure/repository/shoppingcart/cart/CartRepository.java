package com.liquorsgolden.lq.infrastructure.repository.shoppingcart.cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<CartDto, Long> {

}
