package com.example.orderservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/*
@author Marukha
created on 28.05.2024 inside
the package - com.example.orderservice.config
Have a good coding time inside this  class
*/
@Configuration
public class WebClientConfig {

 @Bean
 @LoadBalanced
 public WebClient.Builder webClient(){
  return WebClient.builder();
 }
}
