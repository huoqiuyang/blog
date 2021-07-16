package com.huo.blog.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huo.blog.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from user where telephone = #{telephone}")
    User findByTelephone(String telephone);
}
