package com.iotek.cloud_huang3.service;

import com.iotek.cloud_huang3.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface UserService {
    User selectByUserInfo(User user);

    User selectByPrimaryKey(Short uid);
}