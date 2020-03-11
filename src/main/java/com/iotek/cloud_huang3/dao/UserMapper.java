package com.iotek.cloud_huang3.dao;

import com.iotek.cloud_huang3.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    User selectByUserInfo(User user);

    User selectByPrimaryKey(Short id);
}