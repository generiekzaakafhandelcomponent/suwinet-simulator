package com.ritense.suwitense.webservice.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.*;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class CustomWebSecurityConfigurerAdapter {
    Logger logger = LoggerFactory.getLogger(CustomWebSecurityConfigurerAdapter.class);

    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Value("${simulator.username}")
    private String username;

    @Value("${simulator.password}")
    private String password;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser(username)
                .password(passwordEncoder().encode(password))
                .authorities("ROLE_USER");
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeHttpRequests((authorize) -> authorize
                .requestMatchers(
                        new AntPathRequestMatcher("/actuator/health")
                ).permitAll()
                .anyRequest().authenticated())
                .httpBasic(withDefaults()
        );

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails admin = User.builder().username("admin").
                password(passwordEncoder().encode("admin")).
                roles("ADMIN").
                build();

        return new InMemoryUserDetailsManager(admin);
    }
}
