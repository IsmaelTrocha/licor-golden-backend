package com.liquorsgolden.lq.infrastructure.repository.status;

import com.liquorsgolden.lq.domain.entities.Status;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {
    StatusDtoMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface StatusDtoMapper extends EntityToDto<Status, StatusDto> {

}
