package com.youcheng.runner.core.service.repository;

import com.youcheng.runner.core.service.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
