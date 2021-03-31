package com.OrderMicroService.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OrderMicroService.entity.UserInfo;

@Repository
public interface UserRepository  extends JpaRepository<UserInfo, Integer>{	
	public UserInfo getUserByuserId(Long userId);
}
