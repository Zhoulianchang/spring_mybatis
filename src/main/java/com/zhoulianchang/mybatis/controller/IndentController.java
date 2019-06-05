package com.zhoulianchang.mybatis.controller;

import com.zhoulianchang.mybatis.entity.response.Result;
import com.zhoulianchang.mybatis.service.IndentService;
import com.zhoulianchang.mybatis.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author zlc
 * @date 2019-06-05 21:01
 */
@RestController
@RequestMapping("/v1")
public class IndentController {
    private final IndentService indentService;

    @Autowired
    public IndentController(IndentService indentService) {
        this.indentService = indentService;
    }

    @GetMapping("/indent")
    public Result findByTime(String startTime,String endTime){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return indentService.findByTime(sdf.parse(startTime),sdf.parse(endTime));
        } catch (ParseException e) {
            return ResultUtils.failed("时间的格式必须是yyyy-MM-dd格式");
        }
    }

    @GetMapping("/indent/page")
    public Result findByTimeAndPage(String startTime,String endTime,Integer pageNum,Integer pageSize){
        return indentService.findByTime(startTime,endTime,pageNum,pageSize);
    }
}
