package com.taskapp.service.impl;

import com.taskapp.model.Customer;
import com.taskapp.service.CustomerService;

import java.util.HashMap;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {

    static Map<String, Customer> customers = new HashMap<String, Customer>();

    public CustomerServiceImpl() {}

    @Override
    public Customer getCustomer(String id) {
        System.out.println(id);
        System.out.println(customers);
        return customers.get(id);
    }

    @Override
    public void addCustomer(Customer customer) {
        System.out.println(customer);
        System.out.println(customer.getEmail());
        customers.put(customer.getEmail(), customer);
    }
}
