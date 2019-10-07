package com.person.schedualsystem.domain;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * 员工信息表
 * @author created by aimy
 * date : 2019/10/2 10:22
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="t_employee")
@Entity
public class EmployeeDto extends BaseDto {
    /**
     * 员工编号
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private int id;
    /**
     * 员工姓名
     */
    private String name;
    /**
     * 部门id
     */
    private int depId;
    /**
     * 电话号码
     */
    private String phone;
    /**
     * 紧急联系电话
     */
    private String backupPhone;
    /**
     * 户籍地址
     */
    private String address;
    /**
     * 现居住地
     */
    private String liveAddress;
    /**
     * 入职日期
     */
    @JSONField(format="yyyy-MM-dd")
    private Date entryDate;
    /**
     * 离职日期
     */
    @JSONField(format="yyyy-MM-dd")
    private Date leaveDate;


}
