package com.umu360.patterns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.ws.ServiceMode;

@Service
public class LightOnCommand implements  Command {

    @Autowired
    private Light light;


    public void execute() {

        light.lightOn();
    }
}
