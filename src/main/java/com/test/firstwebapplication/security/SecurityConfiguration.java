package com.test.firstwebapplication.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@SuppressWarnings("deprecation")
@Configuration
public class SecurityConfiguration {
	 @Autowired
	 public void configureGlobalSecurity(AuthenticationManagerBuilder auth)
	 throws Exception {
	 auth.inMemoryAuthentication()
	 .passwordEncoder(NoOpPasswordEncoder.getInstance())
	 .withUser("Vlada").password("vlada123")
	 .roles("USER", "ADMIN");
	 }
}
	
