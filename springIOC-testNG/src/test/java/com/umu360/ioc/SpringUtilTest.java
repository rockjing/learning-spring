package com.umu360.ioc;



import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Map;


@ContextConfiguration(locations = { "classpath:spring-test.xml" })
public class SpringUtilTest  extends AbstractTestNGSpringContextTests {

    @Test
    public void TestGetAllImpl() {

        Map<String, IAnimal> result = SpringUtil.getApplicationContext().getBeansOfType(IAnimal.class);

        for (Map.Entry<String, IAnimal> entry : result.entrySet()) {
            System.out.print(entry.getKey() +" : ");//默认是类名（不带报名）
            System.out.println(entry.getValue().getClass());//类的全名输出
            //调用对象的方法输出
            entry.getValue().Cry();
        }


    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme