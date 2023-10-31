package com.liquorsgolden.lq.infrastructure.repository.address;

import com.liquorsgolden.lq.domain.entities.Address;
import com.liquorsgolden.lq.infrastructure.repository.city.CityDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.user.CustomerDtoMapper;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    CityDtoMapper.class,
    CustomerDtoMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AddressDtoMapper extends EntityToDto<Address, AddressDto> {

}
