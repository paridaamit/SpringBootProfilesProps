package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		/*
		 * option args 
		 * read all keys
		 */
		Set<String> s2=args.getOptionNames();
		System.out.println(s2);
		
		//one key related values
		
		List<String> s1 = args.getOptionValues("profile");
		System.out.println(s1);
		
		
		//non option args............
		List<String> nonop = args.getNonOptionArgs();
		System.out.println(nonop);
		
		//all args
		String[] arr= args.getSourceArgs();
		System.out.println(arr);
		System.out.println(Arrays.asList(arr));
	}

}
