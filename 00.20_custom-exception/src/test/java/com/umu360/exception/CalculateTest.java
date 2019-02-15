package com.umu360.exception;

import org.testng.annotations.Test;

public class CalculateTest {
    Calculate calculate = new Calculate();

    @Test(expectedExceptions = CustomException.class)
    public void testDisplay() throws CustomException {

        calculate.display(0);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme