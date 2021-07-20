package com.huo.blog.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("reply")
public class Reply {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private Integer replyType;   //0代表回复评论，1代表回复其他人的回复

    private Integer replyId;   //若是回复的是评论，此处填评论ID;若是回复其他人的回复，此处填reply表id,即“id"

    private Integer userId;     //回复人id

    private String userName;   //回复人昵称

    private Integer beReplyId;  //被回复人ID

    private String beReplyName;  //被回复人昵称

    private String content;     //回复内容

    private Date createTime;    //回复时间
}
