package com.dimensionality.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 * @ImportResource(locations = {"classpath:beans.xml"})：导入Spring的配置文件
 *
 */
//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class DimensionalitySpringBootApplication {

    public static void main(String[] args) {

        //Spring应用启动起来
        SpringApplication.run(DimensionalitySpringBootApplication.class, args);
    }
}


