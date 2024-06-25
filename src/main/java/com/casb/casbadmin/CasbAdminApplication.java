package com.casb.casbadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.casb.casbadmin.mapper")
public class CasbAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(CasbAdminApplication.class, args);
        System.out.printf("后台启动成功");
    }

}
