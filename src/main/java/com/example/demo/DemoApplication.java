package com.example.demo;

import com.example.demo.Entity.Apple;
import com.example.demo.Entity.Child;
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
				// classpath 这个东西实际上叫做路径表达式
				// 这个类路径实际上就是 target 里面的 class 里面的东西
				// /Users/weijiexiang/code/idea/demo/target/classes
				new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Apple apple1 = applicationContext.getBean("apple1", Apple.class);
		System.out.println(apple1.toString());

		Apple apple2 = applicationContext.getBean("apple2", Apple.class);
		System.out.println(apple2.toString());

		Child child1 = applicationContext.getBean("child1", Child.class);
		System.out.println(child1);
	}



}
