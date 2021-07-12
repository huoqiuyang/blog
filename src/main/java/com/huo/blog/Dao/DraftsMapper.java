package com.huo.blog.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huo.blog.Entity.Drafts;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface DraftsMapper extends BaseMapper<Drafts> {
}
