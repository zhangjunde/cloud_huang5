package com.iotek.apiservice.APIService;

import com.iotek.apiservice.entity.User;
import com.iotek.apiservice.fallback.APIFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value="cloud-provider", fallback = APIFallback.class)
@RequestMapping("v1")
public interface APIService {

    @PostMapping(value="/login")
    public User login(@RequestBody User user);


    @GetMapping(value="/{userId}")
    public User getUserById(@PathVariable Short userId);

    //通过用户id得到用户信息
    @GetMapping(value="/{userInfo}/{uid}")
    public String getUserInfo(@PathVariable(value="userInfo") String userInfo, @PathVariable(value="uid") Short uid);
}