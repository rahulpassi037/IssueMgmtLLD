package com.taskapp.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Issue {

    String issueId;

    String transactionId;

    IssueStatus status;

    IssueType type;

    String subject;

    String description;

    Customer customer;

    CustomerAgent customerAgent;
}
