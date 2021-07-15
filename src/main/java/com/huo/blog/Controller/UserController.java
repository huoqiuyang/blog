package com.huo.blog.Controller;

import com.huo.blog.Common.AjaxResult;
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


}
