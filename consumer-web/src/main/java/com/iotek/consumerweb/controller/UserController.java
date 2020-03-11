package com.iotek.consumerweb.controller;

import com.iotek.apiservice.entity.User;
import com.iotek.consumerweb.service.APIServiceForCosumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.annotation.RequestScope;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.PrimitiveIterator;

@Controller
public class UserController {
    @Autowired
    private APIServiceForCosumer apiServiceForCosumer;

    @RequestMapping("")
    public String index(){
        return "index";
    }

    @RequestMapping(value="/username", method = RequestMethod.GET)
    public String getUsername(HashMap hashmap){
        String userInfo="usernameInfo";
        short uid=1;
        String name = apiServiceForCosumer.getUserInfo(userInfo, uid);
        hashmap.put("username", name);
        return "userInfo";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String login(@ModelAttribute User user, HashMap hashmap){

        user  = apiServiceForCosumer.login(user);

        if(user ==null){
            return "index";
        }

        hashmap.put("user",user);

        return "userInfo";
    }


}
