package com.example.demo;

import com.example.demo.review.entity.User;
import com.example.demo.review.user.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	UserService userService;

	@Test
	public void contextLoads() {
		List<User> userList = userService.findAll();
		System.out.println("==========userInfo============");
		for(User user:userList){
			System.out.println(user);
		}

		userList = userService.getAll();
		System.out.println("==========userInfo==MAPPER============");
		for(User user:userList){
			System.out.println(user);
		}
	}

}
