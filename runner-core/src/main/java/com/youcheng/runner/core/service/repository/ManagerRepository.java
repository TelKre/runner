package com.youcheng.runner.core.service.repository;

import com.youcheng.runner.core.service.domain.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Long> {

    public Manager findByUsernameAndPassword(String username, String password);
}

