package com.huo.blog.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huo.blog.Entity.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BlogMapper extends BaseMapper<Blog> {
}
