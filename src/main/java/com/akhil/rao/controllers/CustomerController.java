package com.akhil.rao.controllers;

import com.akhil.rao.models.Customer;
import com.akhil.rao.repositories.CustomerRepository;
import com.akhil.rao.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<Customer> getAllCustomers(){
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }

    @RequestMapping(path = "/customers", method = RequestMethod.POST)
    public Customer insertCustomer(@RequestBody Customer customer){
        return loginService.insertNewCustomer(customer);
    }
}
