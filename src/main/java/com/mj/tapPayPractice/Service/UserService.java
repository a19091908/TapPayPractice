package com.mj.tapPayPractice.Service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	public Integer getUserId() {
		System.out.println("進入UserService的getUserId方法");
		int userId = 402170532;
		return userId;
	}
}
