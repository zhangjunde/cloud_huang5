package com.iotek.consumerweb.service;

import com.iotek.apiservice.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Repository
public class UserService {
    @Autowired
    private RestTemplate restTemplate;

   @HystrixCommand(fallbackMethod = "getUsernameFallback")
    public String getUsername(String userInfo, short uid){

        ResponseEntity<String> entity = restTemplate.getForEntity(
                "http://cloud-provider/v1/user/{userInfo}/{uid}",
                String.class, userInfo, uid
        );
        return entity.getBody();
    }

    public String getUsernameFallback(String userInfo, short uid){
       return "error";
    }

    public User login(User user) {

        user = restTemplate.postForObject(
                "http://cloud-provider/v1/user/login",
                user,
                User.class
        );

        return user;
    }
}
