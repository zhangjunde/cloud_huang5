package com.iotek.provider.service;

import com.iotek.apiservice.entity.User;


public interface UserService {
    User selectByUserInfo(User user);

    User selectByPrimaryKey(Short uid);
}