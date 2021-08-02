package com.example.demo3;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("sonny")
@Getter
@Setter
public class SonnyProperties {
    String team;
    String salary;
}
