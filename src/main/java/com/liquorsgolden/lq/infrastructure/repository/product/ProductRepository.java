package com.liquorsgolden.lq.infrastructure.repository.product;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductDto, Long> {
  @Modifying
  @Query(value="UPDATE ProductDto p SET p.nameProduct= :nameProduct, p.description= :description, p.price= :price WHERE p.id = :id")
  void modifyProduct(String nameProduct, String description, Double price, Long id);

  @Modifying
  @Query(value="UPDATE ProductDto p SET p.stock = :stock WHERE p.nameProduct = :nameProduct")
  void updateStockProduct(int stock, String nameProduct);

  List<ProductDto> findByCategory_IdOrderByIdAsc(Long categoryId);
  List<ProductDto> findByProportion_IdOrderByIdAsc(Long proportionId);
}