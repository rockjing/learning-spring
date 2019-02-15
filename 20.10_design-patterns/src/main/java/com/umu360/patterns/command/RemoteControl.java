package com.umu360.patterns.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 建立遥控器的类,发出打开灯的命令,同时引入命令对象,buttonPress方法,按下按钮,打开灯.
 */

@Component
public class RemoteControl {

    @Autowired
    private Command lightOnCommand;

    public void buttonPress() {
        lightOnCommand.execute();
    }
}
