package com.globant.corp.gtools.resurce.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.session.web.http.HeaderHttpSessionStrategy;

@SpringBootApplication
public class GtoolsResourceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtoolsResourceApiApplication.class, args);
	}
        
        @Bean
        HeaderHttpSessionStrategy sessionStrategy() {
          return new HeaderHttpSessionStrategy();
        }
        
}
