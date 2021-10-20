package com.trainingexample.cloudfunctiondemo;

import java.util.function.Function;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class Functions {
  @Bean
  Function<String, String> uppercase(){
    return message -> {
      log.info("message received {}", message);
      return message.toUpperCase();
    };
  }

  @Bean
  Function<String, String> reverse(){
    return message -> {
      log.info("message received {}", message);
      return new StringBuilder(message).reverse().toString();
    };
  }
}
