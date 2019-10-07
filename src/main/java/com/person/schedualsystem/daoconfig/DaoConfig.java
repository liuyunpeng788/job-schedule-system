package com.person.schedualsystem.daoconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@tk.mybatis.spring.annotation.MapperScan("*.**.repository")
@EnableTransactionManagement
public class DaoConfig{

}