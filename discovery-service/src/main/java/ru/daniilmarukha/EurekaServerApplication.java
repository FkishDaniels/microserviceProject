package ru.daniilmarukha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
@author Marukha
created on 29.05.2024 inside
the package - ru.daniilmarukha
Have a good coding time inside this  class
*/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
 public static void main(String[] args) {
  SpringApplication.run(EurekaServerApplication.class, args);
 }
}
