package com.smart.utils;

import javax.sql.DataSource;

public class SysConfig {

    private int sessionTimeOut;

    private int maxTabPageNum;

    private DataSource dataSource;

    public void initFromDB(){
        this.sessionTimeOut = 30;
        this.maxTabPageNum = 10;
    }

    public int getSessionTimeOut(){
        return sessionTimeOut;
    }

    public void setSessionTimeOut(int sessionTimeOut){
        this.sessionTimeOut = sessionTimeOut;
    }

    public int getMaxTabPageNum(){
        return maxTabPageNum;
    }

    public void setMaxTabPageNum(int maxTabPageNum){
        this.maxTabPageNum = maxTabPageNum;
    }

    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public DataSource getDataSource(){
        return dataSource;
    }

}
