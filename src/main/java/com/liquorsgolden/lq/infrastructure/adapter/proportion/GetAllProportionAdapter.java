package com.liquorsgolden.lq.infrastructure.adapter.proportion;

import com.liquorsgolden.lq.domain.entities.Proportion;
import com.liquorsgolden.lq.domain.services.proportion.GetAllProportionService;
import com.liquorsgolden.lq.infrastructure.repository.proportion.ProportionDto;
import com.liquorsgolden.lq.infrastructure.repository.proportion.ProportionDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.proportion.ProportionRepository;
import com.liquorsgolden.lq.shared.exception.message.proportion.ProportionNotFoundException;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@AllArgsConstructor
@Repository
public class GetAllProportionAdapter implements GetAllProportionService {

    private final ProportionRepository proportionRepository;
    private final ProportionDtoMapper proportionDtoMapper;

    @Override
    public List<Proportion> getAllProportion() {
        List<ProportionDto> proportionDtoList = proportionRepository.findAll();
        if (proportionDtoList.isEmpty()) {
            throw new ProportionNotFoundException(
                    "No existen proporciones registradas en BD");
        }
        return proportionDtoMapper.toEntity(proportionDtoList);
    }
}
