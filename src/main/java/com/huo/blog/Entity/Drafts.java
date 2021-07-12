package com.huo.blog.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 草稿表实体类
 * @author huoqy
 * @date 2021/7/12
 * @param
 */
@Data
@TableName("drafts")
public class Drafts {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private Integer UserId;
    private String title;   //标题
    private String content; //内容
    private Date createTime; //创建时间
    private Date updateTime; //修改时间
}
