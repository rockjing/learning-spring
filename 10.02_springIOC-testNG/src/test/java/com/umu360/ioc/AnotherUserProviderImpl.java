package com.umu360.ioc;

import org.springframework.stereotype.Component;


public class AnotherUserProviderImpl implements  IUserProvider {

    public void printUser() {
        System.out.println("implementation class is " + this.getClass().getName());
    }
}
