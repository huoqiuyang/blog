package com.huo.blog.Vo;

import com.huo.blog.Entity.Blog;
import lombok.Data;

@Data
public class BlogVo {

    private Integer pageNo;

    private Integer pageSize;

    private Blog blog;
}
