package com.test.service;


import com.test.entity.User;



public interface IUserService {
    User selectUser(int userid);
    int insert(User user);

}
