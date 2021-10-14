package com.jango.backend.model.mapper;

import com.jango.backend.model.dto.CreateUserDto;
import com.jango.backend.model.entity.User;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface UserMapper {

    User dtoToEntity(CreateUserDto createUserDto);
}
