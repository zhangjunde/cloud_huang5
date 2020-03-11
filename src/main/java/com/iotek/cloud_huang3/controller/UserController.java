package com.iotek.cloud_huang3.controller;

import com.iotek.cloud_huang3.entity.User;
import com.iotek.cloud_huang3.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value="/{version}/user")
@Api(value="UserController", tags = {"UserController"}, produces = APPLICATION_JSON_VALUE)
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value="/login")
    @ApiOperation(value="登录", httpMethod = "post", produces = APPLICATION_JSON_VALUE)
    @ApiImplicitParam(name="user", value="用户登录信息", dataType = "User")
    public User login(@ModelAttribute User user){
        return userService.selectByUserInfo(user);
    }

    @GetMapping(value="/{userId}")
    @ApiOperation(value="用过用户id查询用户", httpMethod = "get", produces = APPLICATION_JSON_VALUE)
    @ApiImplicitParam(name="user", value="用户登录信息", dataType = "User",required = true, type="path")
    public User getUserById(@PathVariable Short userId){
        return userService.selectByPrimaryKey(userId);
    }
}