package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements CommandLineRunner
{
 public void run(String... ags)
 {
	 System.out.println("implemented class runner");
 }
}
