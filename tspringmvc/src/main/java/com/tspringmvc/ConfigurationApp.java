package com.tspringmvc;

import com.tspringmvc.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationApp {
  @Bean
  public UserService userService(){
    return new UserService();
  }
}
