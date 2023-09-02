package com.liquorsgolden.lq.infrastructure.repository.city;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<CityDto, Long> {

}
