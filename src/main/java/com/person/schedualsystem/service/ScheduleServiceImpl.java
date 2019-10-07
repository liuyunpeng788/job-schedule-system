package com.person.schedualsystem.service;

import com.person.schedualsystem.domain.ScheduleDto;
import com.person.schedualsystem.repository.ScheduleMapper;
import com.person.schedualsystem.vo.ScheduleVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 调度服务
 * @author created by aimy
 * date: 2019/10/7 22:17
 */
@Service
public class ScheduleServiceImpl {
    @Autowired
    private ScheduleMapper scheduleMapper;

    /**
     * 添加所有的排班调度
     * @param scheduleVos 排班调度对象
     * @return 保存的数量
     */
    public int saveAll(List<ScheduleVo> scheduleVos){
        if(CollectionUtils.isEmpty(scheduleVos)){
            return -1;
        }
        List<ScheduleDto> scheduleDtos = new ArrayList<>(scheduleVos.size());
        ScheduleDto dto;
        for (ScheduleVo vo: scheduleVos  ) {
            dto = new ScheduleDto();
            BeanUtils.copyProperties(vo,dto);
            scheduleDtos.add(dto);
        }
        return scheduleMapper.insertList(scheduleDtos);
    }

}
