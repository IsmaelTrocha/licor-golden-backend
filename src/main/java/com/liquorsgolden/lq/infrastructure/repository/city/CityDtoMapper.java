package com.liquorsgolden.lq.infrastructure.repository.city;

import com.liquorsgolden.lq.domain.entities.City;
import com.liquorsgolden.lq.infrastructure.repository.city.CityDto;
import com.liquorsgolden.lq.infrastructure.repository.country.CountryDtoMapper;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    CountryDtoMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CityDtoMapper extends EntityToDto<City, CityDto> {

}
