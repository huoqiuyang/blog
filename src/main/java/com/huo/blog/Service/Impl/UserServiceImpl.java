package com.huo.blog.Service.Impl;

import com.huo.blog.Common.BusinessException;
import com.huo.blog.Dao.UserMapper;
import com.huo.blog.Entity.User;
import com.huo.blog.Service.UserService;
import com.huo.blog.Vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean login(Map<String, String> map) {
        return true;
    }

    @Override
    public void saveOrUpdate(UserVo vo) {
        User user = vo.getUser();
        if (user.getId() == null){
            //判断手机号是否已被注册
            User user1 = userMapper.findByTelephone(user.getTelephone());
            if (!Objects.isNull(user1)) {throw new BusinessException("该手机号已注册，请直接登录"); }
            user.setCreateTime(new Date());
            user.setType(0);
            //设置默认头像

            userMapper.insert(user);
        }
        user.setUpdateTime(new Date());
        userMapper.updateById(user);
    }

    @Override
    public User findById(Integer userId) {
        return userMapper.selectById(userId);
    }
}
