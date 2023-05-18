package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   //Use to mark the configuration class that defines one or more  beans and alos trigger the auto-configuration
public class SampleApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(SampleApplication.class, args);
	}
}
