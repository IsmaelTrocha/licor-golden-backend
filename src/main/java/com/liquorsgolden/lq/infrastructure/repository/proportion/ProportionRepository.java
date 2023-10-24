package com.liquorsgolden.lq.infrastructure.repository.proportion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProportionRepository extends JpaRepository<ProportionDto, Long> {
}
