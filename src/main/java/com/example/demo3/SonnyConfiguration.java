package com.example.demo3;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SonnyProperties.class)
public class SonnyConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "sonny", name = {"team", "salary"})
    public Sonny sonny(SonnyProperties sonnyProperties) {
        Sonny sonny = new Sonny();
        sonny.setTeam(sonnyProperties.getTeam());
        sonny.setSalary(sonnyProperties.getSalary());

        return sonny;
    }
}
