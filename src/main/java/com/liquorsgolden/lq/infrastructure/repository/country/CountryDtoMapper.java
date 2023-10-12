package com.liquorsgolden.lq.infrastructure.repository.country;

import com.liquorsgolden.lq.domain.entities.Country;
import com.liquorsgolden.lq.infrastructure.repository.country.CountryDto;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface CountryDtoMapper extends EntityToDto<Country, CountryDto> {

}
