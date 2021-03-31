package com.OrderMicroService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OrderMicroService.entity.UserInfo;
import com.OrderMicroService.repostory.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	/** best practice to add auto wired at the setter, help in the unit testing. **/
	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserInfo getListOfOrder(UserInfo userId) {
		UserInfo fetchedUserInfo = userRepository.getUserByuserId(userId.getUserId());
		return fetchedUserInfo;
	}

}
