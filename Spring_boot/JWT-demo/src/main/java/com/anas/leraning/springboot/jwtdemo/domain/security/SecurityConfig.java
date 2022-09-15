package com.anas.leraning.springboot.jwtdemo.domain.security;

import com.anas.leraning.springboot.jwtdemo.filter.CustomAuthorizationFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 14/09/2022
 */
@EnableWebSecurity @Configuration @RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final UserDetailsService userDetailsService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        final var authenticationFilter = new CustomAuthenticationFilter(authenticationManagerBean());
        authenticationFilter.setFilterProcessesUrl("/api/login"); // default is /login
        http.csrf().disable(); // Disable CSRF (cross site request forgery)
        // http.authorizeRequests().anyRequest().permitAll(); // Allow access to all endpoints

        // Allow access to login and refresh token endpoints
        http.authorizeRequests().antMatchers("/api/login/**", "/api/token/refresh/**").permitAll();
        http.authorizeRequests().antMatchers("/roles").permitAll(); // Allow access to /roles endpoint (the order matters)

        http.authorizeRequests().antMatchers(HttpMethod.GET, "/api/users/**").hasAnyAuthority("ROLE_USER");
        http.authorizeRequests().antMatchers(HttpMethod.POST, "/api/users/save/**").hasAnyAuthority("ROLE_ADMIN");

        // http.authorizeRequests().anyRequest().authenticated(); // All endpoints require authentication (the order matters)

        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS); // Disable session creation on Spring Security
        http.addFilter(authenticationFilter); // Add JWT Authorization filter
        http.addFilterBefore(new CustomAuthorizationFilter(), CustomAuthenticationFilter.class); // Add JWT Authorization filter
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
