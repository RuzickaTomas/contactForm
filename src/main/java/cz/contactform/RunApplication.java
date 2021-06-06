package cz.contactform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import cz.contactform.controller.FormController;
import cz.contactform.service.ContactFormService;

@SpringBootApplication
public class RunApplication {

	public static void main(String[] args) {
		 SpringApplication.run(RunApplication.class, args);
	}
}
