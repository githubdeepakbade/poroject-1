package com.lcwd.user.service.UserService.services;

import com.lcwd.user.service.UserService.entitiy.User;

import java.util.List;

public interface UserService {
    //create
    User saveUser(User user);

    //get all user
    List<User>getAllUser();
    //get single user of given
    User getUser(String userId);
}
