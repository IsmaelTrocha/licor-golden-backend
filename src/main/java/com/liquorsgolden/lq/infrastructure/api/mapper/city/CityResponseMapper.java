package com.liquorsgolden.lq.infrastructure.api.mapper.city;

import com.liquorsgolden.lq.domain.entities.City;
import com.liquorsgolden.lq.infrastructure.api.dto.response.city.CityResponse;
import com.liquorsgolden.lq.infrastructure.api.mapper.country.CountryResponseMapper;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING,uses = {
    CountryResponseMapper.class,
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CityResponseMapper extends EntityToDto<City, CityResponse> {

}
