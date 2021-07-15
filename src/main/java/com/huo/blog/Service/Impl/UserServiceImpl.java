package com.huo.blog.Service.Impl;

import com.huo.blog.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public boolean login(Map<String, String> map) {
        return true;
    }
}
