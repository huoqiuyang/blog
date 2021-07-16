package com.huo.blog.Service;

import com.huo.blog.Entity.Comment;

public interface CommentService {
    Boolean save(Comment comment);

    void deleteById(Integer commentId, Integer userId);
}
