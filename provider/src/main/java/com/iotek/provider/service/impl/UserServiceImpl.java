package com.iotek.provider.service.impl;

import com.iotek.apiservice.entity.User;
import com.iotek.provider.dao.UserMapper;
import com.iotek.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByUserInfo(User user) {
        return userMapper.selectByUserInfo(user);
    }

    @Override
    public User selectByPrimaryKey(Short uid) {
        return userMapper.selectByPrimaryKey(uid);
    }
}