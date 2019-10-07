package com.person.schedualsystem.controller;

import com.person.schedualsystem.service.EmployeeServiceImpl;
import com.person.schedualsystem.vo.EmployeeVo;
import com.person.schedualsystem.vo.response.ResponseVo;
import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author created by aimy
 * date: 2019/10/7 16:21
 */
@RestController
@RequestMapping(value = "/employee")
@ApiModel(value = "EmployeeController")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;

    @ResponseBody
    @GetMapping("/{id}")
    public ResponseVo<EmployeeVo> findById(@PathVariable(name = "id")Integer id){
        EmployeeVo vo =  employeeService.findById(id);
        return new ResponseVo<EmployeeVo>().success(vo);
    }
    @ResponseBody
    @PutMapping("/save")
    public ResponseVo<String> findById(List<EmployeeVo> employeeVos){
        String msg = employeeService.saveAll(employeeVos);
        return new ResponseVo<String>().success(msg);
    }
}
