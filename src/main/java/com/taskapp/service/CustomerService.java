package com.taskapp.service;

import com.taskapp.model.Customer;

public interface CustomerService {

    public Customer getCustomer(String customerId);

    public void addCustomer(Customer customer);
}
