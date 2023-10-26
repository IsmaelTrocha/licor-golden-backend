package com.liquorsgolden.lq.infrastructure.api.mapper.proportion;

import com.liquorsgolden.lq.domain.entities.Proportion;
import com.liquorsgolden.lq.infrastructure.api.dto.response.proportion.ProportionResponse;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProportionResponseMapper extends EntityToDto<Proportion, ProportionResponse> {
}
