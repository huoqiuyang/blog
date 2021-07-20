package com.huo.blog.Service.Impl;

import com.huo.blog.Entity.Blog;
import com.huo.blog.Service.BlogService;
import com.huo.blog.Vo.BlogVo;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {
    @Override
    public void saveOrUpdate(BlogVo blogVo) {
        Blog blog = blogVo.getBlog();

    }
}
