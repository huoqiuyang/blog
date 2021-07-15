package com.huo.blog.filter;

import com.huo.blog.Common.AjaxResult;
import com.huo.blog.Common.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
@Slf4j
public class GlobalExceptionHandler  {
    @ExceptionHandler(BusinessException.class)
    public AjaxResult handleLobbyException (BusinessException e)
    {
        return AjaxResult.error (206, e.getMessage ());
    }

    @ExceptionHandler(value = Exception.class)
    public AjaxResult errorHandler (HttpServletRequest request, HttpServletResponse response, Exception e)
    {

        StringBuffer requestURL = request.getRequestURL ();
        if (log.isDebugEnabled ())
        {
            log.debug ("异常请求路径 {}", requestURL);
        }
        if (e instanceof org.springframework.web.servlet.NoHandlerFoundException)
        {
            return AjaxResult.error (404, "资源不存在");
        } else if (e instanceof MethodArgumentNotValidException)//参数错误
        {
            List<ObjectError> errors = ((MethodArgumentNotValidException) e).getBindingResult ().getAllErrors ();
            StringBuilder sb = new StringBuilder ();
            errors.forEach (v -> sb.append (v.getDefaultMessage ()).append (","));
            // 将最后一个“,”替换成“.”
            sb.replace(sb.length()-1,sb.length(),".");
            if (log.isDebugEnabled ())
            {
                log.debug ("输入参数错误:{}", errors);
            }
            return AjaxResult.error (206, sb.toString ());
        } else
        {
            log.error ("系统未知异常: ", e);
            return AjaxResult.error (500, "系统未知异常，稍后再试");
        }
    }
}
