package com.sb.awsLambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AwsLambdaApplication extends  SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(AwsLambdaApplication.class, args);
	}

}

