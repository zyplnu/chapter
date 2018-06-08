package com.smart.service;

import com.smart.dao.LogDao;
import com.smart.dao.Plugin;
import com.smart.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("prototype")
@Service(value = "logonService")
public class LogonService {

    private LogDao logDao;

    @Autowired
    public void setLogDao(LogDao logDao) {
        this.logDao = logDao;
    }
}
