package com.umu360.ioc;

import org.springframework.stereotype.Service;

@Service
public class CatImpl  implements  IAnimal{


    public void Cry() {
        System.out.println("The cat is crying!");
    }
}
