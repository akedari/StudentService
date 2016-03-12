package com.proctor.backendservice.config;

import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * Created by ashekar on 3/12/2016.
 */
@Configuration
public class MainConfiguration {
  @Bean
  public WebMvcConfigurer corsConfigurer(){
    return new WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter(){
      @Override
      public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**").allowedMethods("POST","GET","DELETE","PUT");
      }
    };
  }


}
