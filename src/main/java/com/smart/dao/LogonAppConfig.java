package com.smart.dao;

import com.smart.service.LogonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:com/smart/beanfactory/beans3.xml")
public class LogonAppConfig {

    @Bean
    @Autowired
    public LogonService logonService(UserDao userDao , LogDao logDao){
        LogonService logonService = new LogonService();
        logonService.setLogDao(logDao);
        return logonService;
    }

}