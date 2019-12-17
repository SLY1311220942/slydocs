package com.sly.slydocs.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author SLY
 * @time 2019/12/17
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/css/**", "/index").permitAll()
                .antMatchers("/user/**").hasRole("USER")
                .and()
                .formLogin()
                .and()
                .csrf().disable() //关闭CSRF
                .formLogin().loginPage("/login")
                .loginProcessingUrl("/form")
                //成功登陆后跳转页面
                .defaultSuccessUrl("/index")
                .failureUrl("/loginError").permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("admin").password("123456").roles("USER")
                .and()
                .withUser("test").password("test123").roles("ADMIN");
    }
}
