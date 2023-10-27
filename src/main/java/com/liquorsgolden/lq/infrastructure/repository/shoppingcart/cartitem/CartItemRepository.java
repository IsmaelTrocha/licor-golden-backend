package com.liquorsgolden.lq.infrastructure.repository.shoppingcart.cartitem;

import com.liquorsgolden.lq.infrastructure.repository.product.ProductDto;
import com.liquorsgolden.lq.infrastructure.repository.user.CustomerDto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CartItemRepository extends JpaRepository<CartItemDto, Long> {

  @Modifying
  @Transactional
  @Query(value = "UPDATE CartItemDto sc SET sc.quantity= :quantity WHERE sc.id =:id")
  void updateShoppingCartQuantity(
      @Param("quantity") int quantity,
      @Param("id") Long id);
}
