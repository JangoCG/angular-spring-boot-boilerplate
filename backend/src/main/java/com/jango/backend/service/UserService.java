package com.jango.backend.service;

import com.jango.backend.model.dto.CreateUserDto;
import com.jango.backend.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private  UserRepository userRepository;
//    private  UserMapper userMapper;


    public String createUser(CreateUserDto userDto){
//        User user = userMapper.dtoToEntity(userDto);
//        System.out.println(user);
        return  "test";

    }
}
