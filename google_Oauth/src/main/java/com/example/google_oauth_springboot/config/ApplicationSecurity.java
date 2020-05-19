package com.example.google_oauth_springboot.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableOAuth2Sso
public class ApplicationSecurity extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .antMatcher("/**")
                .authorizeRequests()

                //아래 요청들은 무조건 접근을 허가한다는 의미
                .antMatchers("/", "/callback", "/login**", "/webjars/**", "/error**").permitAll()
                .anyRequest()
                .authenticated();
    }
}
