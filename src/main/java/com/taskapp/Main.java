package com.taskapp;

import com.taskapp.model.*;
import com.taskapp.service.AgentService;
import com.taskapp.service.CustomerService;
import com.taskapp.service.IssueManagementService;
import com.taskapp.service.impl.AgentServiceImpl;
import com.taskapp.service.impl.CustomerServiceImpl;
import com.taskapp.service.impl.IssueManagementServiceImpl;

import java.util.Collections;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        IssueManagementService issueManagementService = new IssueManagementServiceImpl();
        CustomerService customerService = new CustomerServiceImpl();
        AgentService agentService = new AgentServiceImpl();

        customerService.addCustomer(Customer.builder()
                        .email("test@test.com")
                        .customerId(UUID.randomUUID().toString())
                        .phoneNumber("134567890")
                .build());

        issueManagementService.createIssue(CreateIssueRequest.builder()
                        .email("test@test.com")
                        .description("test description")
                        .subject("test subject")
                        .transactionId(UUID.randomUUID().toString())
                        .type(IssueType.PAYMENT_RELATED)
                .build());

        agentService.addAgent(CustomerAgent.builder()
                        .email("test1@test.com")
                        .expertise(Collections.singletonList(IssueType.PAYMENT_RELATED))
                        .name("test")
                .build());

        System.out.println(agentService.getAgent("test1@test.com"));

        System.out.println("Completed execution");
    }
}