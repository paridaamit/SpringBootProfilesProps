package com.app.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class AppConfig 
{
	@Bean
	public CommandLineRunner cm1()
	{
		return new CommandLineRunner()
		{
		public void run(String... args)	
		  {
			System.out.println("from cm1");
		  }
		};
		
			
	}
	@Bean
	public CommandLineRunner cm2()
	{
		return (args)->
		{
			System.out.println("from cm2");
		};
	}
	@Bean

	public CommandLineRunner cm3()
	{
		return args->System.out.println("from cm3");
	}
}
