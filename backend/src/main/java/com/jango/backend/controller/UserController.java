package com.jango.backend.controller;

import com.jango.backend.model.dto.CreateUserDto;
import com.jango.backend.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public String createUser(@RequestBody CreateUserDto createUserDto) {
        userService.createUser(createUserDto);
        return "test";

    }

}

