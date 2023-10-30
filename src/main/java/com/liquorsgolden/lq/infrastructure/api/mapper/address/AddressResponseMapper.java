package com.liquorsgolden.lq.infrastructure.api.mapper.address;

import com.liquorsgolden.lq.domain.entities.Address;
import com.liquorsgolden.lq.infrastructure.api.dto.response.address.AddressResponse;
import com.liquorsgolden.lq.infrastructure.api.mapper.city.CityResponseMapper;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    CityResponseMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AddressResponseMapper extends EntityToDto<Address, AddressResponse> {

}
