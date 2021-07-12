package com.huo.blog.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("user")
public class User {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String userName;
    private String sex;

    private String phone;

    private String password;

    private String autograph;   //个性签名

    private String hedUrl;    //头像地址

    private Date birthday;

    private Date createTime;

    private Date updateTime;

}
