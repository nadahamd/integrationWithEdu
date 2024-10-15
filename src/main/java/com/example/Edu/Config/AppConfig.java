package com.example.Edu.Config;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

@Configuration
@PropertySource(value = {"classpath:API.properties"})
public class AppConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    private Environment env;

    @Autowired
    public void setEnv(Environment env) {
        this.env = env;
    }
}
