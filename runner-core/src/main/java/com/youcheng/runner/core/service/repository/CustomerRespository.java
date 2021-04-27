package com.youcheng.runner.core.service.repository;

import com.youcheng.runner.core.service.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRespository extends JpaRepository<Customer, Long>{

    public Customer findByUsernameAndPassword(String username, String password);

}