package com.smart.service;

import com.smart.dao.Plugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class MyComponent {

    @Autowired(required = false)
    private List<Plugin> plugins;

    @Autowired
    private Map<String , Plugin> pluginMap;

    public List<Plugin> getPlugins() {
        return plugins;
    }
}
