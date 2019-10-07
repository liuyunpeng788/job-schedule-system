package com.person.schedualsystem.domain;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 基础字段信息类
 * @author: created by aimy
 * date: 2019/10/2 14:10
 */
@Getter
@Setter
public class BaseDto {
    /**
     * 创建时间
     */
    @JSONField(format="yyyy-MM-dd hh:MM:ss")
    private Date createTime;
    /**
     * 更新时间
     */
    @JSONField(format="yyyy-MM-dd hh:MM:ss")
    private Date updateTime;
}
