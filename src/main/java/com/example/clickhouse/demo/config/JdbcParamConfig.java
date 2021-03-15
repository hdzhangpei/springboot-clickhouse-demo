package com.example.clickhouse.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.datasource.click")
@Data
public class JdbcParamConfig {
    private String userName;
    private String password;
    private String driverClassName ;
    private String url ;
    private Integer initialSize ;
    private Integer maxActive ;
    private Integer minIdle ;
    private Integer maxWait ;
    private String validationQuery;

}
