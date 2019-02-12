package com.umu360.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;


@ContextConfiguration(locations = { "classpath:spring-aopannotation.xml" })
public class AspectAopTest  extends AbstractTestNGSpringContextTests {

    @Autowired
    private IUserService userService;

    @Test(expectedExceptions = RuntimeException.class)
    public void aopAnnotationTest() {
        userService.addUser();
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme