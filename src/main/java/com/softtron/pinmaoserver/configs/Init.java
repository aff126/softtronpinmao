package com.softtron.pinmaoserver.configs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.softtron")
@ImportResource(locations= {"classpath:spring.xml"})
@MapperScan({"com.softtron.pinmaoorder.dao"})
public class Init {
	public static void main(String[] args) {
		SpringApplication.run(Init.class);
	}
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		// TODO Auto-generated method stub
//		return builder.sources(Init.class);
//	}
}