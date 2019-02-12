package com.umu360.patterns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

import javax.annotation.Resource;

@ContextConfiguration(locations = { "classpath:spring-test.xml" })
public class RemoteControlTest extends BaseTest {

    @Autowired
    RemoteControl remote;

    @Test
    public void testRemoteButtonPress() {
        remote.buttonPress();
    }
}
