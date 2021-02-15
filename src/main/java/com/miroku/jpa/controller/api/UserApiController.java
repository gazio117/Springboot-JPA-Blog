package com.miroku.jpa.controller.api;

import com.miroku.jpa.dto.ResponseDto;
import com.miroku.jpa.model.RoleType;
import com.miroku.jpa.model.User;
import com.miroku.jpa.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/api/user")
    public ResponseDto<Integer> save(@RequestBody User user) {
        user.setRole(RoleType.USER);
        userService.save(user);
        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
    }
}
