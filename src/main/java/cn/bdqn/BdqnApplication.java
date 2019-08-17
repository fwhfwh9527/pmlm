package cn.bdqn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.bdqn.mapper")
public class BdqnApplication {

    public static void main(String[] args) {
        SpringApplication.run(BdqnApplication.class, args);
    }

}
