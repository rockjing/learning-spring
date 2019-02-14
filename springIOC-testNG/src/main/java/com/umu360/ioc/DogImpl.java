package com.umu360.ioc;

import org.springframework.stereotype.Service;

@Service
public class DogImpl implements IAnimal {

    public void Cry() {
        System.out.println("The dog is crying!");
    }
}
