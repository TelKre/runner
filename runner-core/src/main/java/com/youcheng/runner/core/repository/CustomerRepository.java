package com.youcheng.runner.core.repository;

import com.youcheng.runner.core.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

    public Customer findByUsernameAndPassword(String username, String password);

    public List<Customer> findByType(Integer type);

}
