package com.jango.backend.model.mapper;

import com.jango.backend.model.dto.CreateUserDto;
import com.jango.backend.model.entity.User;



public interface UserMapper {

    User dtoToEntity(CreateUserDto createUserDto);
}
