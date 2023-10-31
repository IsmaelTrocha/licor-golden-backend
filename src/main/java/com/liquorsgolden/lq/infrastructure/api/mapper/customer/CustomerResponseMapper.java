package com.liquorsgolden.lq.infrastructure.api.mapper.customer;

import com.liquorsgolden.lq.domain.entities.Customer;
import com.liquorsgolden.lq.infrastructure.api.dto.response.CustomerResponse;
import com.liquorsgolden.lq.infrastructure.api.mapper.address.AddressResponseMapper;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    AddressResponseMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CustomerResponseMapper extends EntityToDto<Customer, CustomerResponse> {

}
