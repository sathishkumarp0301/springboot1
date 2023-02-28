package com.employee;




import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration

public class Authentication extends WebSecurityConfigurerAdapter{

@Override
protected void configure (HttpSecurity http)throws Exception{
//PasswordEncoder encoder=PasswordEncoderFactories.createDelegatingPasswordEncoder();
http.csrf().disable();
http.headers().frameOptions().disable();
http.authorizeRequests()
.antMatchers("/Employees/getAllEmployees")


.fullyAuthenticated()
.and()
.httpBasic();
}
@Bean
public static NoOpPasswordEncoder passwordEncoder() {
return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
}
}



