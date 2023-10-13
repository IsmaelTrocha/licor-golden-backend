package com.liquorsgolden.lq.infrastructure.repository.status;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<StatusDto, Long> {
}
