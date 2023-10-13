package com.liquorsgolden.lq.infrastructure.api.mapper.status;

import com.liquorsgolden.lq.domain.entities.Status;
import com.liquorsgolden.lq.infrastructure.api.dto.response.status.StatusResponse;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface StatusResponseMapper extends EntityToDto<Status, StatusResponse> {
}
