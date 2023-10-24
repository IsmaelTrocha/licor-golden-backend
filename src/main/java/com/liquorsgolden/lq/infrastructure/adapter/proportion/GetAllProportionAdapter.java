package com.liquorsgolden.lq.infrastructure.adapter.proportion;

import com.liquorsgolden.lq.domain.entities.Proportion;
import com.liquorsgolden.lq.domain.services.proportion.GetAllProportionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@AllArgsConstructor
@Repository
public class GetAllProportionAdapter implements GetAllProportionService {
    @Override
    public List<Proportion> getAllProportion() {
        return null;
    }
}
