package com.iotek.apiservice.fallback;

import com.iotek.apiservice.APIService.APIService;
import com.iotek.apiservice.entity.User;
import org.springframework.stereotype.Component;

@Component
public class APIFallback implements APIService {
    @Override
    public User login(User user) {
        return null;
    }

    @Override
    public User getUserById(Short userId) {
        return null;
    }

    @Override
    public String getUserInfo(String userInfo, Short uid) {
        return "error";
    }
}
