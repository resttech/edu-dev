package com.mkyong;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;

public class App {
	
	public static void main(String[] args) {

		String springConfig = "spring/batch/jobs/job-report.xml";

		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
		
	
	}
	
	
}
