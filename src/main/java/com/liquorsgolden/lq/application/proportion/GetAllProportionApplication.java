package com.liquorsgolden.lq.application.proportion;

import com.liquorsgolden.lq.domain.entities.Proportion;
import com.liquorsgolden.lq.domain.entities.Status;
import com.liquorsgolden.lq.domain.services.proportion.GetAllProportionService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class GetAllProportionApplication {

    private final GetAllProportionService getAllProportionService;

    public List<Proportion> getAllProportion() {
        return getAllProportionService.getAllProportion();
    }
}