package com.OrderMicroService.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OrderMicroService.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
