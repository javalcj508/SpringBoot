package com.dimensionality.boot;

import com.dimensionality.boot.config.Person;
import com.dimensionality.boot.config.PersonValue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DimensionalitySpringBootApplicationTest {

    //日志记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private Person person;

    @Autowired
    private PersonValue personValue;

    //注入Spring IOC容器
    @Autowired
    private ApplicationContext ioc;

    @Test
    public void testIoc() {
        //查看ioc容器中是否存在自己创建的容器
        boolean beans = ioc.containsBean("beans");
        System.out.println(beans);

        //日志的级别  由低到高
        //可以调整输出日志的级别，日志就只会在这个级别以后的高级级别生效
        logger.trace("这是trace日志...");
        logger.debug("这是debug日志...");
        //SpringBoot默认的是info级别的日志,没有指定级别的就用默认级别
        logger.info("这是info日志...");
        logger.warn("这是warn日志...");
        logger.error("这是error日志...");
    }

    @Test
    public void testIocBeans() {
        //查看ioc容器中是否存在自己创建的容器
        boolean beans = ioc.containsBean("beans");
        System.out.println(beans);
    }

    @Test
    public void testPersonProperties() {
        System.out.println(person);
        System.out.println("-------------------");
        //System.out.println(personValue);
    }
}
