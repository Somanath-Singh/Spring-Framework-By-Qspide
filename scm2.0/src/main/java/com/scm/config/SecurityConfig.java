package com.scm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

  @Autowired
  private UserDetailsService userDetailsService;

  @Autowired
  private OAuthAuthenticationSuccessHandler handler;

  /*
   * @Bean
   * public UserDetailsService userDetailsService() {
   * UserDetails user1 = User
   * .withDefaultPasswordEncoder()
   * .username("admin123")
   * .password("admin123")
   * .roles("ADMIN","USER")
   * .build();
   * UserDetails user2 = User
   * .withDefaultPasswordEncoder()
   * .username("user123")
   * .password("user123")
   * .build();
   * return new InMemoryUserDetailsManager(user1,user2);
   * }
   */

  @Bean
  BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();

  }

  @Bean
  public DaoAuthenticationProvider daoAuthenticationProvider() {
    DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
    daoAuthenticationProvider.setUserDetailsService(userDetailsService);
    daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
    return daoAuthenticationProvider;
  }

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
        .csrf(csrf -> csrf.disable())
        .authorizeHttpRequests(requests -> {
          requests.requestMatchers("/user/**").authenticated();
          requests.anyRequest().permitAll();
        });
    http.formLogin(login -> login.loginPage("/login")
        .loginProcessingUrl("/authenticate")
        .successForwardUrl("/user/profile")
        .usernameParameter("email")
        .passwordParameter("password")
        .permitAll());

    http.csrf(AbstractHttpConfigurer::disable);

    // oauth2 configuration
    http.oauth2Login(oauth -> {
      oauth.loginPage("/login");
      oauth.successHandler(handler);

    });
    return http.build();
  }

}
