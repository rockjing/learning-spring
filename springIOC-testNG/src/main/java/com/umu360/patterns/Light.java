package com.umu360.patterns;

import org.springframework.stereotype.Component;

/**
 * 建立灯的实现类,接受者,实际的打开灯对象
 */
@Component
public class Light {

    public void lightOn() {
        System.out.println("开灯!!");
    }
}
