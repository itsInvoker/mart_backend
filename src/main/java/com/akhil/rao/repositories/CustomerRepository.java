package com.akhil.rao.repositories;

import com.akhil.rao.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, List> {
    public Customer findCustomersByUsername(String username);
}
