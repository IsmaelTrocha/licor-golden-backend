package com.liquorsgolden.lq.infrastructure.repository.user;

import com.liquorsgolden.lq.domain.entities.User;
import com.liquorsgolden.lq.infrastructure.repository.user.UserDto;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface UserDtoMapper extends EntityToDto<User, UserDto> {

}
