package com.iotek.provider.dao;

import com.iotek.apiservice.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    User selectByUserInfo(User user);

    User selectByPrimaryKey(Short id);
}