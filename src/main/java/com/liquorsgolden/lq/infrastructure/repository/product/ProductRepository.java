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

  List<ProductDto> findByCategory_IdOrderByIdAsc(Long categoryId);

  List<ProductDto> findByProportion_IdOrderByIdAsc(Long proportionId);
  @Query("SELECT p FROM ProductDto p WHERE p.quantitySold > 20")
  List<ProductDto> findByQuantitySold();

}