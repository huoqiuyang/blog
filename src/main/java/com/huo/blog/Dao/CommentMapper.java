package com.huo.blog.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huo.blog.Entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CommentMapper extends BaseMapper<Comment> {
}
