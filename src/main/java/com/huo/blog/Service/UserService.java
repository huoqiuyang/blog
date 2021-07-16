package com.huo.blog.Service;

import com.huo.blog.Entity.User;
import com.huo.blog.Vo.UserVo;

import java.util.Map;

public interface UserService {
    boolean login(Map<String, String> map);

    void saveOrUpdate(UserVo vo);

    User findById(Integer userId);
}
