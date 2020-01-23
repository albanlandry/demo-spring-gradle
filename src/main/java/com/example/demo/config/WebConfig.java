package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	  
	  @Bean
	  public ViewResolver viewResolver() {
	    InternalResourceViewResolver vr = new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
	    vr.setOrder(0);
	    return vr;
	  }
}
