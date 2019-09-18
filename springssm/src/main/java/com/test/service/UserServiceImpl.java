package com.test.service;

import com.test.dao.IUserDao;
import com.test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService{

    @Resource
    private IUserDao userdao;


    public User selectUser(int userid) {
        return userdao.selectUser(userid);
    }

    public int insert(User user) {
        return 0;
    }
}
