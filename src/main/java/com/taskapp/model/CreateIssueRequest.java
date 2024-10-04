package com.taskapp.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateIssueRequest {

    String transactionId;

    IssueType type;

    String subject;

    String description;

    String email;
}
