package com.shina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.DispatcherServlet;

//@SpringBootApplication
@ComponentScan()
@EnableAutoConfiguration
public class GoodTimeApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		//SpringApplication.run(GoodTimeApplication.class, args);
		
		ApplicationContext ctx = SpringApplication.run(GoodTimeApplication.class, args);
		
		DispatcherServlet dispatcherServlet = (DispatcherServlet)ctx.getBean("dispatcherServlet");
        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
	}

}
