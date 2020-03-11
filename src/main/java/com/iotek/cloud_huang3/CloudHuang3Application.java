package com.iotek.cloud_huang3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.iotek.cloud_huang3.dao")
@EnableSwagger2
public class CloudHuang3Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudHuang3Application.class, args);
    }

}
