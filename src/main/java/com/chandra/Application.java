package com.chandra;

import com.chandra.service.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext cntxt= SpringApplication.run(Application.class, args);
	CustomerService customerService=cntxt.getBean(CustomerService.class);
	//customerService.saveData();
	customerService.Delete();
	}

}
