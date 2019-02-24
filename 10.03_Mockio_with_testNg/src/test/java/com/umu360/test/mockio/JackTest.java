package com.umu360.test.mockio;

import com.umu360.mockio.Jack;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
import static org.testng.AssertJUnit.assertFalse;

public class JackTest {
    Jack jack = new Jack();

    @Test
    public void testGo() {

        Jack spyJack = spy(new Jack());


        //使用spy的桩实现实际还是会调用stub的方法，只是返回了stub的值
        when(spyJack.Go()).thenReturn(false);
        assertFalse(spyJack.Go());


//        //不会调用stub的方法
//        doReturn(false).when(spyJack).Go();
//        assertFalse(spyJack.Go());
//
//
//        doReturn(false).when(spyJack.Go());

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme