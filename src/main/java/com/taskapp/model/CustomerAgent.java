package com.taskapp.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CustomerAgent {

    String email;

    String name;

    List<IssueType> expertise;
}
