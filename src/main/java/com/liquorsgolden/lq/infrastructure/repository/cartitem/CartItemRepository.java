package com.liquorsgolden.lq.infrastructure.repository.cartitem;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItemDto, Long> {

  @Transactional
  @Modifying
  @Query(value = "UPDATE CartItemDto c SET c.quantity =:quantity WHERE c.id =:id ")
  void updateShoppingCartQuantity(int quantity, Long id);
}
