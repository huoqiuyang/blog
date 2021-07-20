package com.huo.blog.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("blog_type")
public class Type {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer userId;
}
