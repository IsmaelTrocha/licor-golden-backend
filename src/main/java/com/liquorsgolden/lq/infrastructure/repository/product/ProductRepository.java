package com.liquorsgolden.lq.infrastructure.repository.product;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductDto, Long> {


  List<ProductDto> findByCategory_IdOrderByIdAsc(Long categoryId);

  @Query("SELECT p FROM ProductDto p WHERE p.quantitySold > 20")
  List<ProductDto> findByQuantitySold();

=======
  List<ProductDto> findByProportion_IdOrderByIdAsc(Long proportionId);

}