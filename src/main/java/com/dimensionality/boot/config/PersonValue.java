package com.dimensionality.boot.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Value("lastName")
 * @Value("")不支持复杂的封装类型
 * <bean>
 *      <property name="lastName" value="字面量/${key}从环境变量、配置文件中获取到变量的值/#{SpEl}"></property>
 * <bean/>
 */
@Component
@Data
public class PersonValue {

    @Value("${person.lastName}")
    private String lastName;
    @Value("#{11*2}")
    private Integer age;
    @Value("true")
    private Boolean boss;
    /**
     * @Value("")不支持复杂的封装类型
     */
    /*@Value("${person.birth}")
    private Date birth;
    @Value("${person.maps}")
    private Map<String, Object> maps;
    @Value("${person.lists}")
    private List<Object> lists;
    @Value("${person.dog}")
    private Dog dog;*/

}
