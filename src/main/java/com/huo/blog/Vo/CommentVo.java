package com.huo.blog.Vo;

import com.huo.blog.Entity.Comment;
import lombok.Data;

@Data
public class CommentVo {

    private Integer pageNo;

    private Integer pageSize;



    private Comment comment;
}
