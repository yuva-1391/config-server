/*package com.configServer.conServer;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {

	        http
	                //HTTP Basic authentication
	                .httpBasic()
	                .and()
	                .authorizeRequests().antMatchers("/login*").permitAll()
	                .and()
	                .csrf().disable()
	                .formLogin().disable();
	    }

}
*/