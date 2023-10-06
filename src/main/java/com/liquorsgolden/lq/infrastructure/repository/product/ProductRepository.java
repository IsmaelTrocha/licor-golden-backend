package com.liquorsgolden.lq.infrastructure.repository.product;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductDto, Long> {

  @Modifying
  @Query(value="UPDATE ProductDto p SET p.name= :name, p.description= :description, p.price= :price WHERE p.id = :id")
  void modifyProduct(String name, String description, Double price, Long id);
}