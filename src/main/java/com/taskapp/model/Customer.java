package com.taskapp.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {

    String customerId;

    String email;

    String phoneNumber;
}
