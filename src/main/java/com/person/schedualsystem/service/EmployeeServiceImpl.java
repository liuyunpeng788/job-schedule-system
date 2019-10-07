package com.person.schedualsystem.service;

import com.person.schedualsystem.domain.EmployeeDto;
import com.person.schedualsystem.repository.EmployeeMapper;
import com.person.schedualsystem.vo.EmployeeVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author created by aimy
 * date: 2019/10/7 16:34
 */
@Service
public class EmployeeServiceImpl {
    @Autowired
    private EmployeeMapper employeeMapper;

    public EmployeeVo findById(Integer uid){
//        EmployeeDto employeeDto = employeeMapper.selectByPrimaryKey(uid);
        EmployeeVo vo = new EmployeeVo();
//        BeanUtils.copyProperties(employeeDto,vo);
        return vo;
    }

    /**
     * 添加员工信息
     * @param employeeVos 员工信息列表ZA
     * @return 执行成功或者失败
     */
    public String saveAll(List<EmployeeVo> employeeVos) {
        String msg ;
        if(CollectionUtils.isEmpty(employeeVos)){
            msg = "员工信息列表不能为空";
            return msg;
        }
        List<EmployeeDto> list = new ArrayList<>(employeeVos.size());
        EmployeeDto dto;
        for(EmployeeVo employeeVo : employeeVos){
            dto = new EmployeeDto();
            BeanUtils.copyProperties(employeeVo,dto);
            dto.setCreateTime(new Date());
            dto.setUpdateTime(new Date());
            list.add(dto);
        }
        int cnt = employeeMapper.insertList(list);
        return "成功添加" + cnt + "条员工信息";
    }
}
