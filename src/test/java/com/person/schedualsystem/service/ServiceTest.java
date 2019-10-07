package com.person.schedualsystem.service;

import com.person.schedualsystem.domain.EmployeeDto;
import com.person.schedualsystem.vo.EmployeeVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author created by aimy
 * date: 2019/10/7 19:38
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {
    @Autowired
    private EmployeeServiceImpl employeeService;

    @Test
    public void insertEmployee(){
        List<EmployeeVo> employeeDtos = new ArrayList<>(10);
        EmployeeVo dto = new EmployeeVo();
        dto.setName("test1");
        dto.setDepId(1);
        dto.setPhone("13916692729");
        dto.setAddress("湖南省桃源市隆兴县");
        dto.setEntryDate(new Date(119,3,2));

        employeeDtos.add(dto);
        dto = new EmployeeVo();
        dto.setName("test2");
        dto.setDepId(1);
        dto.setPhone("15800852312");
        dto.setAddress("湖南省桃源市长兴县");
        dto.setEntryDate(new Date(119,5,1));

        employeeDtos.add(dto);
        employeeService.saveAll(employeeDtos);

    }

}
