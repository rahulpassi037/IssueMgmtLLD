package com.taskapp.service;

import com.taskapp.model.CreateIssueRequest;

public interface IssueManagementService {

    public void createIssue(CreateIssueRequest issue);
}
