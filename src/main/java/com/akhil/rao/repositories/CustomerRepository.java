package com.akhil.rao.repositories;

import com.akhil.rao.models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, List> {
    public Customer findCustomersByUsername(String username);
}
