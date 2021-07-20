package com.huo.blog.Service;

import com.huo.blog.Entity.Blog;
import com.huo.blog.Vo.BlogVo;

public interface BlogService {
    void saveOrUpdate(BlogVo blogVo);

    Blog findById(Integer id);
}
