package com.dimensionality.boot.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中的每一个属性的值，映射到这个组件中
 *
 * @ConfigurationProperties：告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定
 * prefix = "person"：配置文件中的哪个下面的所有属性进行一一映射
 *
 * 只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能
 *
 * @PropertySource(value = {"classpath:person.properties"})：
 *      加载指定的配置文件，但是其他配置文件中不能有相关的配置
 */
@Data
@ConfigurationProperties(prefix = "person")
@Component
@ToString
@PropertySource(value = {"classpath:person.properties"})
public class Person {

    private String lastName;
    private Integer age;
    private Boolean boss;
    private Date birth;

    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;

}
