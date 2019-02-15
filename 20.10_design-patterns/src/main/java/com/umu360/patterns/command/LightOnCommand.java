package com.umu360.patterns.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LightOnCommand implements  Command {

    @Autowired
    private Light light;


    public void execute() {

        light.lightOn();
    }
}
