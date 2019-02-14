package com.umu360.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@ContextConfiguration(locations = { "classpath:spring-test.xml" })
public class IAnimalTest extends AbstractTestNGSpringContextTests {

    @Resource
    private  IAnimal dogImpl;
    @Resource
    private  IAnimal catImpl;




    @Test
    public  void TestCryInResourceIOC(){

        dogImpl.Cry();
        catImpl.Cry();
        Assert.assertEquals(1,1);
    }

    /*
    匿名类中是无法装配实例的
     */
    @Test(expectedExceptions =java.lang.NullPointerException.class )
    public  void TestCryInResourceIOCInUnknowClass(){

        InnerInterface innerInterface = new InnerInterface() {

            @Resource
            private  IAnimal dogImpl;

            public  void SayIt() {
                dogImpl.Cry();
            }
        };
        ((InnerInterface) innerInterface).SayIt();



        Assert.assertEquals(1,1);
    }



    public  abstract class InnerInterface {

        public abstract void SayIt();
    }

}



//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme