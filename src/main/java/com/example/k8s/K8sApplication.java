package com.example.k8s;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.k8s.mapper")
public class K8sApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sApplication.class, args);
    }

}
