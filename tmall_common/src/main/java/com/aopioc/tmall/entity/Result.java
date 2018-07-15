package com.aopioc.tmall.entity;

import java.io.Serializable;

/**
 * 返回的结果集
 * author by JefferyChang on  2018/7/18
 */
public class Result implements Serializable {

    public Result() {
    }

    public Result(boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }


    private boolean flag;//是否成功标志位

    private Integer code;//返回状态码

    private String message;//返回的提示信息

    private Object data;//返回的数据

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
