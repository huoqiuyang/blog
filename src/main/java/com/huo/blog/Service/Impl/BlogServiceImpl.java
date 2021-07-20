package com.huo.blog.Service.Impl;

import com.huo.blog.Dao.BlogMapper;
import com.huo.blog.Entity.Blog;
import com.huo.blog.Service.BlogService;
import com.huo.blog.Vo.BlogVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public void saveOrUpdate(BlogVo blogVo) {
        Blog blog = blogVo.getBlog();

    }

    @Override
    public Blog findById(Integer id) {
        return blogMapper.selectById(id);
    }
}
