package com.globant.corp.gtools.resurce.api.config.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author ramiro.acoglanis
 */
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
      http.cors()
          .and()
          .authorizeRequests().anyRequest().authenticated()
          .and()
          .httpBasic().disable();
    }
    
}
