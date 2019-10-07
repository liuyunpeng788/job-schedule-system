package com.person.schedualsystem.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * 部门信息
 * @author  created by aimy
 * date: 2019/10/2 14:04
 */
@Getter
@Setter
@Table(name="t_department")
@Entity
public class DepartmentDto extends BaseDto {
    /**
     * 部门id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 部门名称
     */
    private String  name;
    /**
     * 父级部门id
     */
    private Integer pid;
    /**
     * 级别
     */
    private Integer  level;
    /**
     * 备注
     */
    private String  remark;


}
