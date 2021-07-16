package com.huo.blog.Controller;

import com.huo.blog.Common.AjaxResult;
import com.huo.blog.Entity.Comment;
import com.huo.blog.Service.CommentService;
import com.huo.blog.Vo.CommentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 评论相关接口
 * @author huoqy
 * @date 2021/7/16
 * @param
 */
@RestController
@RequestMapping("api/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/add")
    public AjaxResult add(@RequestBody Comment comment){
        Boolean res = commentService.save(comment);
        if (res) {
            return new AjaxResult(res, "保存成功");
        }
        return new AjaxResult(false,"保存失败");
    }

    @DeleteMapping("{commentId}/{userId}")
    public AjaxResult deleteById(@PathVariable Integer commentId,@PathVariable Integer userId){
        try {
            commentService.deleteById(commentId,userId);
        } catch (Exception e){
            e.printStackTrace();
            return new AjaxResult(false,e.getMessage());
        }
        return new AjaxResult(true,"删除成功");
    }
}
