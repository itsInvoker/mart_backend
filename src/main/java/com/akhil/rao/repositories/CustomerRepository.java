package com.akhil.rao.repositories;

import com.akhil.rao.models.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, List> {
    public Customer findCustomersByUsername(String username);
}
