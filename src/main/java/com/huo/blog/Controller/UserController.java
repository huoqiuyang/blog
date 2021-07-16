package com.huo.blog.Controller;

import com.huo.blog.Common.AjaxResult;
import com.huo.blog.Entity.User;
import com.huo.blog.Service.UserService;
import com.huo.blog.Utils.JwtUtil;
import com.huo.blog.Vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("/login")
    public AjaxResult login(@RequestBody Map<String,String> map){
        if(userService.login(map)){
            String token = JwtUtil.sign(map.get("userName"), map.get("password"));
            if (token != null) {
                return AjaxResult.success("成功",token);
            }
        }
        return AjaxResult.fail();

    }

    @PostMapping("/save")
    public AjaxResult register(@RequestBody UserVo vo){
        try {
            userService.saveOrUpdate(vo);
        } catch (Exception e){
            e.printStackTrace();
            return AjaxResult.error(2000,e.getMessage());
        }
        return AjaxResult.success("保存成功");
    }

    @GetMapping("/findById")
    public AjaxResult findById(Integer userId){
        return new AjaxResult("查询成功",userService.findById(userId));
        //System.out.println("最近公司的项目要求引入swagger,");
    }


//    @PostMapping("/test")
//    public UserVo test(@RequestBody UserVo userVo){
//        User user = userVo.getUser();
//        System.out.println(user.getUserName());
//        UserVo test = new UserVo();
//        test.setUser(userVo.getUser());
//        return test;
//    }
}
