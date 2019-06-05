package com.zhoulianchang.mybatis.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhoulianchang.mybatis.entity.Indent;
import com.zhoulianchang.mybatis.entity.IndentExample;
import com.zhoulianchang.mybatis.entity.response.Result;
import com.zhoulianchang.mybatis.mapper.IndentMapper;
import com.zhoulianchang.mybatis.service.IndentService;
import com.zhoulianchang.mybatis.utils.ResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author zlc
 * @date 2019-06-05 21:00
 */
@Service
public class IndentServiceImpl implements IndentService {
    private static Logger logger = LoggerFactory.getLogger(IndentServiceImpl.class);
    private final IndentMapper indentMapper;

    @Autowired
    public IndentServiceImpl(IndentMapper indentMapper) {
        this.indentMapper = indentMapper;
    }

    @Override
    public Result findByTime(Date startTime, Date endTime) {
        List<Indent> data = indentMapper.selectByExample(getExample(startTime, endTime));
        return ResultUtils.success(data);
    }

    /**
     * 获取查询条件(这里为了方便抽取 实际开发中不会抽取)
     *
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @return
     */
    private IndentExample getExample(Date startTime, Date endTime) {
        // 设置查询条件
        IndentExample example = new IndentExample();
        IndentExample.Criteria criteria = example.createCriteria();
        // 订单状态5和6
        criteria.andStateIn(Arrays.asList(5, 6));
        // 创建时间在开始时间和结束时间之间
        criteria.andCreateTimeBetween(startTime, endTime);
        return example;
    }

    @Override
    public Result findByTime(String startTimeStr, String endTimeStr, Integer pageNum, Integer pageSize) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            // 时间转换
            Date startTime = sdf.parse(startTimeStr);
            Date endTime = sdf.parse(endTimeStr);
            if (startTime.getTime() > endTime.getTime()) {
                return ResultUtils.failed("开始时间要小于结束时间");
            }
            PageHelper.startPage(pageNum, pageSize);
            List<Indent> data = indentMapper.selectByExample(getExample(startTime, endTime));
            PageInfo pageInfo = new PageInfo<>(data);
            return ResultUtils.success(pageInfo);
        } catch (ParseException e) {
            logger.info("error is : {}", e.getMessage());
            return ResultUtils.failed("时间的格式必须是yyyy-MM-dd格式");
        }
    }
}
