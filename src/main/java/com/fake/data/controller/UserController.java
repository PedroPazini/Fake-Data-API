package com.fake.data.controller;

import com.fake.data.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/fake/all/same")
    public ResponseEntity<Object> findFakeUsersRepeated(){
        return new ResponseEntity<>(new RestResponse<>(HttpStatus.OK.value(), userService.findAllFakeUsersRepeated()), HttpStatus.OK);
    }

    @GetMapping(path = "/fake/all/new")
    public ResponseEntity<Object> findFakeUsers(){
        return new ResponseEntity<>(new RestResponse<>(HttpStatus.OK.value(), userService.findAllFakeUsers()), HttpStatus.OK);
    }

}
