package com.huo.blog.Service.Impl;

import com.huo.blog.Common.BusinessException;
import com.huo.blog.Dao.CommentMapper;
import com.huo.blog.Entity.Comment;
import com.huo.blog.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public Boolean save(Comment comment) {

        commentMapper.insert(comment);
        return true;
    }

    @Override
    public void deleteById(Integer commentId, Integer userId) {

        Comment comment = commentMapper.selectById(commentId);
        if (Objects.isNull(comment)) {throw new BusinessException("传入id有误");}
        if (comment.getUserId().equals(userId)){
            commentMapper.deleteById(commentId);
        } else {
            throw new BusinessException("非本人无法删除评论");
        }
    }
}
