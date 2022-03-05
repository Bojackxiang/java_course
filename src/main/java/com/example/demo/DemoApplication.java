package com.example.demo;

import com.example.demo.Entity.Apple;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// 这个原始代码
//		SpringApplication.run(DemoApplication.class, args);

		// 下面是我的代码
		ApplicationContext applicationContext =
				// classpath 指向resource 里面的资源
				new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Apple apple1 = applicationContext.getBean("apple1", Apple.class);
		System.out.println(apple1.toString());

		Apple apple2 = applicationContext.getBean("apple2", Apple.class);
		System.out.println(apple2.toString());
	}



}
