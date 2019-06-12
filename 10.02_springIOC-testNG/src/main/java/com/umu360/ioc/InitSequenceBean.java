package com.umu360.ioc;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Component
public class InitSequenceBean implements InitializingBean, IUserProvider {

    public InitSequenceBean() {
        System.out.println("InitSequenceBean: constructor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("InitSequenceBean: postConstruct");
    }



    public void initMethod() {
        System.out.println("InitSequenceBean: init-method");
    }



    public void afterPropertiesSet() throws Exception {
        System.out.println("InitSequenceBean: afterPropertiesSet");
    }

    public void printUser() {

        System.out.println("implementation class is " + this.getClass().getName());
    }
}
