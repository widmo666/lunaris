package com;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.MoodleUser;
import com.util.MoodleService;

public class App {

	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		System.out.println("*************************************************");
		for (String obj : Arrays.asList(beanDefinitionNames)) {
			System.out.println(obj);
		}
		System.out.println("*************************************************");
		MoodleService moodleService = (MoodleService) context.getBean("moodleServiceImpl");
		List<MoodleUser> allMoodleUsers = moodleService.getAllMoodleUsers();
		for (MoodleUser user : allMoodleUsers) {
			System.out.println(user.getId() + " " + user.getUsername());
		}
		return;
	}

	@Autowired
	MoodleService moodleService;
}
