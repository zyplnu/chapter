package com.smart.service;

import com.smart.dao.DaoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DaoConfig.class)
public class ServiceConfig {

    @Autowired
    private DaoConfig daoConfig;

    @Bean
    public LogonService logonService(){
        LogonService logonService = new LogonService();
        logonService.setLogDao(daoConfig.logDao());
        return logonService;
    }

}
