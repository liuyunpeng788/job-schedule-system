package com.person.schedualsystem.vo;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

/**
 * 任务调度对象
 * @author created by aimy
 * date: 2019/10/7 22:22
 */
@Getter
@Setter
@ApiModel(value = "ScheduleVo",description = "排班调度对象vo")
public class ScheduleVo {
    /**
     * id
     */
    private Integer  id;
    /**
     * 员工id
     */
    private Integer empId;
    /**
     * 日期
     */
    private Integer workDate;
    /**
     * 周几
     */
    private Integer workDateWeek;
}
