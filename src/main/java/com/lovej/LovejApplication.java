package com.lovej;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@MapperScan("com.lovej.Mapper*")
@SpringBootApplication
public class LovejApplication {

	public static void main(String[] args) {
		SpringApplication.run(LovejApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context){
		return args -> {
			/*System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = context.getBeanDefinitionNames();
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}*/
		};
	}
}
