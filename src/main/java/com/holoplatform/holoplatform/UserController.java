package com.holoplatform.holoplatform;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public UserEntity getUser(
            @RequestParam(value = "firstName", defaultValue = "John") String firstName,
            @RequestParam(value = "lastName", defaultValue = "Doe") String lastName) {
        return new UserEntity(firstName, lastName);
    }
}
