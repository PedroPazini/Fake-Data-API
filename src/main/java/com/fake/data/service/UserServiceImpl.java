package com.fake.data.service;

import com.fake.data.dto.UserDto;
import org.springframework.stereotype.Service;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class UserServiceImpl implements UserService{

    private static final Faker faker = new Faker(new Random(12345)); // fixed seed

    private static final List<UserDto> FAKE_USERS = generateUsers(10000);

    private static List<UserDto> generateUsers(int count) {
        List<UserDto> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(new UserDto(
                    faker.name().fullName(),
                    faker.address().fullAddress(),
                    faker.internet().emailAddress()
            ));
        }
        return list;
    }

    @Override
    public List<UserDto> findAllFakeUsersRepeated() {
        return FAKE_USERS;
    }

    @Override
    public List<UserDto> findAllFakeUsers() {
        return generateUsers(100000);
    }
}
