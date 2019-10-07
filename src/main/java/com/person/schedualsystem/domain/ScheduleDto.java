package com.person.schedualsystem.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * 排班信息表
 * @author created by aimy
 * date: 2019/10/2 14:14
 */
@Getter
@Setter
@Table(name="t_schedule")
@Entity
public class ScheduleDto extends BaseDto {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
