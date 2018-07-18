package com.practice.twofactoauth.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	public void configure(HttpSecurity http) throws Exception {
		 http
         .authorizeRequests()
             .antMatchers("/", "/home").permitAll()
             .anyRequest().authenticated()
             .and()
         .formLogin()
             .loginPage("/login")
             .permitAll()
             .and()
         .logout()
             .permitAll();
		 
		 http.formLogin().authenticationDetailsSource(new TOTPWebAuthenticationDetailsSource());

	}

	public UserDetailsService userDetailsService() {
		@SuppressWarnings("deprecation")
		UserDetails userdetails=User.withDefaultPasswordEncoder()
								.username("user").password("password").roles("USER").build();
	
		return new InMemoryUserDetailsManager(userdetails);
	}
	
}