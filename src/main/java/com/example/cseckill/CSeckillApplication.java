package com.example.cseckill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.example.mapper")
//@EnableSwagger2
public class CSeckillApplication {

    public static void main(String[] args) {
        SpringApplication.run(CSeckillApplication.class, args);
    }

}
