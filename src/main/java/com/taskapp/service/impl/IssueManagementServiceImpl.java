package com.taskapp.service.impl;

import com.taskapp.model.CreateIssueRequest;
import com.taskapp.model.Issue;
import com.taskapp.model.IssueStatus;
import com.taskapp.service.CustomerService;
import com.taskapp.service.IssueManagementService;
import org.apache.commons.lang3.Validate;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class IssueManagementServiceImpl implements IssueManagementService {

    Map<String, Issue> issues;
    CustomerService customerService = new CustomerServiceImpl();

    public IssueManagementServiceImpl() {
        issues = new HashMap<String, Issue>();
    }

    @Override
    public void createIssue(CreateIssueRequest createIssueRequest) {
        Validate.notNull(createIssueRequest);
        Validate.notNull(createIssueRequest.getDescription());
        Validate.notNull(createIssueRequest.getType());
        Validate.notNull(createIssueRequest.getEmail());
        Validate.notNull(createIssueRequest.getSubject());
        Validate.notNull(createIssueRequest.getTransactionId());

        Issue issue = buildIssueFromRequest(createIssueRequest);

        System.out.println(issue);

        issues.put(issue.getIssueId(), issue);
    }

    private Issue buildIssueFromRequest(CreateIssueRequest createIssueRequest) {
        return Issue.builder()
                .issueId(String.valueOf(UUID.randomUUID()))
                .type(createIssueRequest.getType())
                .subject(createIssueRequest.getSubject())
                .description(createIssueRequest.getDescription())
                .transactionId(createIssueRequest.getTransactionId())
                .status(IssueStatus.CREATED)
                .customer(customerService.getCustomer(createIssueRequest.getEmail()))
                .build();
    }
}
