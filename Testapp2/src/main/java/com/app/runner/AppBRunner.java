package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(20)
public class AppBRunner implements CommandLineRunner 
{
	public void run(String... args)
	{
		System.out.println("this from b");
	}
}
