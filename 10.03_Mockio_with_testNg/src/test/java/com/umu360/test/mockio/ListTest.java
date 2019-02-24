package com.umu360.test.mockio;

import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ListTest extends BaseTest {


    @Test
    public void TestListInMock() {
          //创建mock对象，参数可以是类，也可以是接口
        List<String> list = mock(List.class);
         
         //设置方法的预期返回值
         //stubbing 打桩
         when(list.get(0)).thenReturn("helloworld");

         String result = list.get(0);

         //验证方法调用(是否调用了get(0))
         verify(list).get(0);

         //junit测试
         Assert.assertEquals("helloworld", result, "it's hello world test");

    }



}
