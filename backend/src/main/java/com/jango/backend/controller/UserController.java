package com.jango.backend.controller;

import com.jango.backend.model.dto.CreateUserDto;
import com.jango.backend.model.entity.User;
import com.jango.backend.model.mapper.UserMapper;
import com.jango.backend.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@AllArgsConstructor
@NoArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping
    public String createUser(@RequestBody CreateUserDto createUserDto) {
        userService.createUser(createUserDto);
        return "test";

    }

}

