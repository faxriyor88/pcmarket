package com.example.pcmarket.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringSecurity extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("super").password(passwordEncoder().encode("super")).roles("SUPER_ADMIN")
                .and()
                .withUser("moderator").password(passwordEncoder().encode("moderator")).roles("MODERATOR")
                .and()
                .withUser("operator").password(passwordEncoder().encode("operator")).roles("OPERATOR");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET,"/api/property/**").hasAnyRole("SUPER_ADMIN,OPERATOR")
                .antMatchers(HttpMethod.POST,"/api/property/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers(HttpMethod.PUT,"/api/property/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers("/api/property/**").hasRole("SUPER_ADMIN")

                .antMatchers(HttpMethod.GET,"/api/basket/**").hasAnyRole("SUPER_ADMIN,OPERATOR")
                .antMatchers(HttpMethod.POST,"/api/basket/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers(HttpMethod.PUT,"/api/basket/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers("/api/basket/**").hasRole("SUPER_ADMIN")

                .antMatchers(HttpMethod.GET,"/api/category/**").hasAnyRole("SUPER_ADMIN,OPERATOR")
                .antMatchers(HttpMethod.POST,"/api/category/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers(HttpMethod.PUT,"/api/category/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers("/api/category/**").hasRole("SUPER_ADMIN")

                .antMatchers(HttpMethod.GET,"/api/characteristics/**").hasAnyRole("SUPER_ADMIN,OPERATOR")
                .antMatchers(HttpMethod.POST,"/api/characteristics/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers(HttpMethod.PUT,"/api/characteristics/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers("/api/characteristics/**").hasRole("SUPER_ADMIN")

                .antMatchers(HttpMethod.GET,"/api/comment/**").hasAnyRole("SUPER_ADMIN,OPERATOR")
                .antMatchers(HttpMethod.POST,"/api/comment/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers(HttpMethod.PUT,"/api/comment/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers("/api/comment/**").hasRole("SUPER_ADMIN")

                .antMatchers(HttpMethod.GET,"/api/curier/**").hasAnyRole("SUPER_ADMIN,OPERATOR")
                .antMatchers(HttpMethod.POST,"/api/curier/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers(HttpMethod.PUT,"/api/curier/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers("/api/curier/**").hasRole("SUPER_ADMIN")

                .antMatchers(HttpMethod.GET,"/api/inputproduct/**").hasAnyRole("SUPER_ADMIN,OPERATOR")
                .antMatchers(HttpMethod.POST,"/api/inputproduct/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers(HttpMethod.PUT,"/api/inputproduct/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers("/api/inputproduct/**").hasRole("SUPER_ADMIN")

                .antMatchers(HttpMethod.GET,"/api/input/**").hasAnyRole("SUPER_ADMIN,OPERATOR")
                .antMatchers(HttpMethod.POST,"/api/input/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers(HttpMethod.PUT,"/api/input/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers("/api/input/**").hasRole("SUPER_ADMIN")

                .antMatchers(HttpMethod.GET,"/api/order/**").hasAnyRole("SUPER_ADMIN,OPERATOR")
                .antMatchers(HttpMethod.POST,"/api/order/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers(HttpMethod.PUT,"/api/order/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers("/api/order/**").hasRole("SUPER_ADMIN")

                .antMatchers(HttpMethod.GET,"/api/outputproduct/**").hasAnyRole("SUPER_ADMIN,OPERATOR")
                .antMatchers(HttpMethod.POST,"/api/outputproduct/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers(HttpMethod.PUT,"/api/outputproduct/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers("/api/outputproduct/**").hasRole("SUPER_ADMIN")

                .antMatchers(HttpMethod.GET,"/api/product/**").hasAnyRole("SUPER_ADMIN,OPERATOR")
                .antMatchers(HttpMethod.POST,"/api/product/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers(HttpMethod.PUT,"/api/product/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers("/api/product/**").hasRole("SUPER_ADMIN")

                .antMatchers(HttpMethod.GET,"/api/supplier/**").hasAnyRole("SUPER_ADMIN,OPERATOR")
                .antMatchers(HttpMethod.POST,"/api/supplier/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers(HttpMethod.PUT,"/api/supplier/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers("/api/supplier/**").hasRole("SUPER_ADMIN")

                .antMatchers(HttpMethod.GET,"/api/user/**").hasAnyRole("SUPER_ADMIN,OPERATOR")
                .antMatchers(HttpMethod.POST,"/api/user/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers(HttpMethod.PUT,"/api/user/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers("/api/user/**").hasRole("SUPER_ADMIN")


                .antMatchers(HttpMethod.GET,"/api/attachment/**").hasAnyRole("SUPER_ADMIN,OPERATOR")
                .antMatchers(HttpMethod.POST,"/api/attachment/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers(HttpMethod.PUT,"/api/attachment/**").hasAnyRole("SUPER_ADMIN,MODERATOR")
                .antMatchers("/api/attachment/**").hasRole("SUPER_ADMIN")

                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
        http .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
