package com.umu360.patterns.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(locations = { "classpath:spring-test.xml" })
public class RemoteControlTest extends AbstractTestNGSpringContextTests {

    @Autowired
    RemoteControl remote;

    @Test
    public void testRemoteButtonPress() {
        remote.buttonPress();
    }
}
