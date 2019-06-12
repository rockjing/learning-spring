package hello.api;

import hello.service.OutSideApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;


@SpringBootTest(classes = OutSideApiService.class)
@Test(expectedExceptions =  org.springframework.beans.factory.UnsatisfiedDependencyException.class,
description = "验证 package 包的bean是无法扫描到的。")
@ContextConfiguration(locations = { "classpath:spring-test.xml" })
public class PackageScanIssueTest {

    @Autowired
    private OutSideApiService outSideApiService;




    @Test(description = "验证 package 包的bean是无法扫描到的。")
    public  void TestOutPackageSevice(){

        Assert.assertNull(outSideApiService);
        System.out.println("验证 package 包的bean是无法扫描到的。");


    }

}
