package com.example.demo.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfiguration {

    @Value("${mysql.driver.url}")
    String mysqlDriver;

    @Value("${spring.datasource.url}")
    String mysqlUrl;

    @Value("${spring.datasource.username}")
    String user;

    @Value("${spring.datasource.password}")
    String pass;
	@Bean
    public DataSource datasource() {
        return DataSourceBuilder.create()
          .driverClassName(mysqlDriver)
          .url(mysqlUrl)
          .username(user)
          .password(pass)
          .build();	
    }
}
