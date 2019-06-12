package hello.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@SpringBootTest(classes = OutSideApiService.class)
public class OutSideApiServiceTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private OutSideApiService outSideApiService;

    @Test
    public void testOutSideApiGreeting() {
        String result = outSideApiService.OutSideApiGreeting();
        Assert.assertNotNull(result);
        System.out.println(result);
        //Assert.assertEquals(result, "replaceMeWithExpectedResult");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme