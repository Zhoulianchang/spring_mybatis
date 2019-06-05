package com.zhoulianchang.mybatis.utils;


import com.zhoulianchang.mybatis.entity.response.Result;

/**
 * @author ZLC
 * @date 2019-06-05 16:28
 **/
public class ResultUtils {
    /**
     * 用于处理成功结果
     * @param data 要返回的数据
     * @param <T> 泛型
     * @return 返回结果集
     */
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<T>();
        result.setCode(200);
        result.setMsg("success...");
        result.setData(data);
        return result;
    }

    /**
     * 用于处理成功结果
     * @param <T> 泛型
     * @return 返回结果集
     */
    public static <T> Result<T> success() {
        Result<T> result = new Result<>();
        result.setCode(200);
        result.setMsg("success...");
        result.setData(null);
        return result;
    }

    public static Result<Object> failed(String message){
        Result<Object> result = new Result<>();
        result.setCode(400);
        result.setData(null);
        result.setMsg(message);
        return result;
    }
}
