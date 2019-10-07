package com.person.schedualsystem.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.base.insert.InsertMapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * @author aimy
 * @param <T> 类型参数
 */
public interface BaseRepository<T> extends Mapper<T>, InsertMapper<T>, InsertListMapper<T> {
}
