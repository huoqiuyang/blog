package com.huo.blog.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 评价表实体类
 * @author huoqy
 * @date 2021/7/12
 * @param
 */
@Data
@TableName("comment")
public class Comment {

    private Integer id;

    private Integer blogId;

    private Integer userId;

    private String userName;

    private String content;    //回复内容

    private Date createTime;  //评论时间
}
