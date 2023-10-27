package com.liquorsgolden.lq.infrastructure.repository.shoppingcart;

import com.liquorsgolden.lq.infrastructure.repository.product.ProductDto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCartDto, Long> {

  @Modifying
  @Transactional
  @Query(value = "UPDATE ShoppingCartDto sc SET sc.quantity= :quantity WHERE sc.id =:id")
  void updateShoppingCartQuantity(int quantity,Long id);

  @Query(value = "")
  List<ProductDto> products(Long customerId);
}
