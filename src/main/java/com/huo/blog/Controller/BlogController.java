package com.huo.blog.Controller;

import com.huo.blog.Common.AjaxResult;
import com.huo.blog.Service.BlogService;
import com.huo.blog.Vo.BlogVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @PostMapping("/save")
    public AjaxResult save(@RequestBody BlogVo blogVo){
        try {
            blogService.saveOrUpdate(blogVo);
        } catch (Exception e){
            e.printStackTrace();
            return new AjaxResult(false,e.getMessage());
        }
        return  AjaxResult.success();
    }

    @GetMapping("/findById")
    public AjaxResult findById(Integer id){

        return new AjaxResult(blogService.findById(id));
    }
}
