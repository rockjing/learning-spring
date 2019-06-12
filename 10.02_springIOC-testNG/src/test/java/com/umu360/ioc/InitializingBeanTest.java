package com.umu360.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import javax.annotation.PostConstruct;

@ContextConfiguration(locations = { "classpath:spring-test.xml" })
public class InitializingBeanTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private  IUserProvider userProvider;

    @Test
    public  void TestBeanInitialization() {

        userProvider.printUser();

    }

    @PostConstruct
    public void postConstruct() {

        this.userProvider = new AnotherUserProviderImpl();
    }
}
