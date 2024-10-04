package com.taskapp.service.impl;

import com.taskapp.model.CustomerAgent;
import com.taskapp.service.AgentService;
import org.apache.commons.lang3.Validate;

import java.util.HashMap;
import java.util.Map;

public class AgentServiceImpl implements AgentService {

    Map<String, CustomerAgent> agents = new HashMap<String, CustomerAgent>();

    @Override
    public void addAgent(CustomerAgent agent) {
        Validate.notNull(agent);
        Validate.notNull(agent.getName());
        Validate.notNull(agent.getEmail());
        agents.put(agent.getEmail(), agent);
    }

    @Override
    public CustomerAgent getAgent(String email) {
        return agents.get(email);
    }

}
