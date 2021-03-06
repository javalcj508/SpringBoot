package com.dimensionality.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration：指明当前类是一个配置类；就是来替代之前的Spring配置文件
 *
 * 之前：
 * 在配置文件中用<bean></bean>标签添加组件
 */
@Configuration
public class MyAppconfig {

    //将方法的返回值添加到容器中，容器中的这个组件默认的id就是方法名
    @Bean
    public Beans beans(){
        System.out.println("配置类@Beans给容器中添加组件了");
        return new Beans();
    }
}
