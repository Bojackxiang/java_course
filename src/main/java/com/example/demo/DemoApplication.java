package com.example.demo;

import com.example.demo.Entity.Apple;
import com.example.demo.Entity.Child;
import com.example.demo.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.ObjectInputFilter;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		// 这个原始代码
		SpringApplication.run(DemoApplication.class, args);


		// 下面是我的代码
//		ApplicationContext applicationContext =
//				// classpath 这个东西实际上叫做路径表达式
//				// 这个类路径实际上就是 target 里面的 class 里面的东西
//				// /Users/weijiexiang/code/idea/demo/target/classes
////				new ClassPathXmlApplicationContext("classpath:applicationContext-demo1.xml");
//				new ClassPathXmlApplicationContext("classpath:applicationContext-*.xml");
//
//		Apple apple1 = applicationContext.getBean("apple1", Apple.class);
//		System.out.println(apple1.toString());
//
////		Apple apple2 = applicationContext.getBean("apple2", Apple.class);
////		System.out.println(apple2.toString());
//
//		Child child1 = applicationContext.getBean("child1", Child.class);
//		System.out.println(child1);
//
//		// 查看容器里面到底有多少 Bean
//		String[] nameList = applicationContext.getBeanDefinitionNames();
//		for (String beanName: nameList){
//			System.out.println("--------------------");
////			System.out.println(beanName);
////			获取 bean 的类型
//			String beanClass = applicationContext.getBean(beanName).getClass().toString();
//			System.out.println(beanClass);
//
//		}
//
//		apple1.getLink();

	}



}
