package com.huo.blog.Common;

import lombok.Data;

import java.util.HashMap;
/**
 * 通用返回类
 * @author huoqy
 * @date 2021/7/13
 * @param
 */
@Data
public class AjaxResult extends HashMap<String,Object> {
    private static final long serialVersionUID = 1L;

    public static final String CODE_TAG = "code";

    public static final String MSG_TAG = "msg";

    public static final String DATA_TAG = "data";

    public static final String FLAG = "flag";


    /** 状态码 */
    private int code;

    /** 返回内容 */
    private String msg;

    /** 数据对象 */
    private Object data;

    /**
     * 初始化一个新创建的 AjaxResult 对象，使其表示一个空消息。
     */
    public AjaxResult() { }

    /**
     * 初始化一个新创建的 AjaxResult 对象,只传message,表示请求成功
     *
     * @param
     * @param msg 返回信息
     */
    public AjaxResult( String msg)
    {
        super.put(FLAG,true);
        super.put(MSG_TAG, msg);
        super.put(CODE_TAG,200);
    }

    /**
     * 输入返回实体类,表示请求成功
     * @param object
     * @param
     */
    public AjaxResult(String msg,Object object)
    {
        super.put(FLAG,true);
        super.put(CODE_TAG,200);
        super.put(MSG_TAG,msg);
        super.put(DATA_TAG, object);
    }

    /**
     *
     * @param flag 请求结果
     * @param msg 返回信息
     */
    public AjaxResult(Boolean flag,String msg){
        super.put(FLAG,flag);
        super.put(CODE_TAG,2000);
        super.put(MSG_TAG,msg);
    }

    /**
     *
     * @param obj
     */
    public AjaxResult(Object obj){
        super.put(FLAG,true);
        super.put(CODE_TAG,200);
        super.put(MSG_TAG,"操作成功");
    }

    /**
     *
     * @param code 状态码
     * @param flag 请求结果
     * @param msg 返回信息
     * @param data 返回数据
     */
    public AjaxResult(Integer code,Boolean flag, String msg, Object data)
    {
        super.put(CODE_TAG,code);
        super.put(FLAG,flag);
        super.put(MSG_TAG, msg);
        super.put(DATA_TAG, data);
    }
    /**
     * 返回成功消息
     * @return 成功消息
     */
    public static AjaxResult success()
    {
        return new AjaxResult("操作成功");
    }


    public static AjaxResult success(String msg){return new AjaxResult(200,true,msg,null);}

    /**
     * 返回成功消息
     * @param msg 返回内容
     * @param data 数据对象
     * @return 成功消息
     */
    public static AjaxResult success(String msg, Object data)
    {
        return new AjaxResult(msg, data);
    }

    /**
     * 返回失败消息
     *
     * @return 成功消息
     */
    public static AjaxResult fail()
    {
        return AjaxResult.fail("操作失败");
    }

    /**
     * 返回失败消息
     *
     * @param msg 返回内容
     * @return 成功消息
     */
    public static AjaxResult fail(String msg)
    {
        return new AjaxResult(false,msg);
    }




    /**
     * 返回错误消息
     *
     * @return
     */
    public static AjaxResult error()
    {
        return AjaxResult.error("操作失败");
    }

    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @return 警告消息
     */
    public static AjaxResult error(String msg)
    {
        return AjaxResult.error(2000,msg);
    }
    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @param code 错误码
     * @return 警告消息
     */
    public static AjaxResult error(Integer code,String msg)
    {
        return AjaxResult.error(code,msg);
    }

    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @param data 数据对象
     * @return 警告消息
     */
    public static AjaxResult error(Integer code,String msg, Object data)
    {
        return new AjaxResult(code,false,msg, data);
    }

}
