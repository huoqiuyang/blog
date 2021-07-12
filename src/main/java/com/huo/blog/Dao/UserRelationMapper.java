package com.huo.blog.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huo.blog.Entity.UserRelation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserRelationMapper extends BaseMapper<UserRelation> {
}
