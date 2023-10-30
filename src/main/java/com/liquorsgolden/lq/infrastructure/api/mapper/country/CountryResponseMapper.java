package com.liquorsgolden.lq.infrastructure.api.mapper.country;

import com.liquorsgolden.lq.domain.entities.Country;
import com.liquorsgolden.lq.infrastructure.api.dto.response.country.CountryResponse;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface CountryResponseMapper extends EntityToDto<Country, CountryResponse> {

}
