package com.huo.blog.Vo;

import com.huo.blog.Entity.User;
import lombok.Data;

/**
 * user类的查询类，用于接收前端的查询参数
 * @author huoqy
 * @date 2021/7/15
 * @param
 */
@Data
public class UserVo {


    private Integer pageNo;

    private Integer pageSize;

    private Integer currentId;       //当前操作人Id

    private User user;              


}
