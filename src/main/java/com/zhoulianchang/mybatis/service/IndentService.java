package com.zhoulianchang.mybatis.service;

import com.zhoulianchang.mybatis.entity.response.Result;

import java.util.Date;

/**
 * @author zlc
 * @date 2019-06-05 21:00
 */
public interface IndentService {
    /**
     * 查找最近七天的数据(分页)
     *
     * @param startTime 开始的时间
     * @param endTime   结束的时间
     * @return 返回的结果集
     */
    Result findByTime(Date startTime, Date endTime);

    /**
     * 查找最近七天的数据(不分页)
     *
     * @param startTime 开始的时间
     * @param endTime 结束的时间
     * @param pageNum 当前页码
     * @param pageSize 页面大小
     * @return 返回的结果集
     */
    Result findByTime(String startTime, String endTime, Integer pageNum, Integer pageSize);
}
