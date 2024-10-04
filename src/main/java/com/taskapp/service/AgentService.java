package com.taskapp.service;

import com.taskapp.model.CustomerAgent;

public interface AgentService {

    public void addAgent(CustomerAgent agent);

    public CustomerAgent getAgent(String email);

}
