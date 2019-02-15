package com.umu360.patterns.strategy.distribution.awards;

import com.umu360.patterns.strategy.distribution.org.Retailer;
import com.umu360.patterns.strategy.distribution.org.RetailerLink;

import com.umu360.patterns.strategy.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

@ContextConfiguration(locations = { "classpath:spring-test.xml" })
public class AwardsCalculationTest extends AbstractTestNGSpringContextTests {

    @Autowired
    AwardsCalculation awardsCalculation;
    @Test
    public void testCalculation() throws AwardsException {

        Order order = new Order();
        List<AwardsItem> awardsItems =  awardsCalculation.Calculation(order);

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme