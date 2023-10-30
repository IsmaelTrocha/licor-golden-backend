package com.liquorsgolden.lq.infrastructure.repository.address;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressDto, Long> {
  @Query("SELECT a FROM AddressDto a WHERE a.customer.id = :id")
  List<AddressDto> addressByCustomerIdIn(@Param("id") Long id);
}
