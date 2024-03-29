package com.akhil.rao.services;

import com.akhil.rao.models.Customer;
import com.akhil.rao.repositories.CustomerRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class LoginService {

    CustomerRepository customerRepository;

    @Autowired
    public LoginService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
        Customer customer1 = new Customer(new ObjectId(),"akhil","akhilrao2797","akhilalekia",new Date());
//        Customer customer2 = new Customer(new ObjectId(),"akhil","akhilrao2797","akhilalekia",new Date());
//        Customer customer3 = new Customer("akhil","akhilrao27","akhilalekia",new Date());
//        Customer customer4 = new Customer("akhil","akhilrao2","akhilalekia",new Date());
        this.customerRepository.save(customer1);
//        this.customerRepository.save(customer2);
//        this.customerRepository.save(customer3);
//        this.customerRepository.save(customer4);
    }

    public boolean login(String user, String password){
        Customer customer = customerRepository.findCustomersByUsername(user);
        if(password.equals(customer.getPassword()))
            return true;
        else
            return false;
    }

    public Customer insertNewCustomer(Customer customer){
        return customerRepository.save(customer);
    }

}
