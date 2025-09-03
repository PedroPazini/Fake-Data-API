package com.fake.data.service;

import com.fake.data.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> findAllFakeUsersRepeated();

    List<UserDto> findAllFakeUsers();

}
