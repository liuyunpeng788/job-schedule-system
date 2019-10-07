package com.person.schedualsystem.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * 部门管理员信息表
 * @author created by aimy
 * date: 2019/10/2 14:07
 */
@Getter
@Setter
@Table(name="t_department_manager")
@Entity
public class DeptMgrDto extends BaseDto {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 部门id
     */
    private Integer depId;
    /**
     * 员工id
     */
    private Integer empId;
    /**
     * 状态  0：无效  1：有效
     */
    private Integer status;


}
