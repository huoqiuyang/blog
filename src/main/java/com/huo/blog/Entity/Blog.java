package com.huo.blog.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("blog")
public class Blog {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private Integer userId;

    private String title;   //博客标题

    private String content;  //博客内容

    private String blogType;  //分类

    private Integer typeId;   // 分类的id号

    private String flag;  //标签

    private Date createTime;
    private Date updateTime;

}
