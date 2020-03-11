package com.iotek.provider.controller;


import com.iotek.apiservice.APIService.APIService;
import com.iotek.apiservice.entity.User;
import com.iotek.provider.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController implements APIService {
    @Autowired
    private UserService userService;

    @PostMapping(value="/login")
    public User login(@RequestBody User user){
        return userService.selectByUserInfo(user);
    }


    @GetMapping(value="/{userId}")
    public User getUserById(@PathVariable Short userId){
        return userService.selectByPrimaryKey(userId);
    }

    //通过用户id得到用户信息
    @GetMapping(value="/{userInfo}/{uid}")
    public String getUserInfo(@PathVariable(value="userInfo") String userInfo,
                              @PathVariable(value="uid") Short uid){
        if("usernameInfo".equals(userInfo)){
            return userService.selectByPrimaryKey(uid).getUname();
        }

        return null;
    }
}