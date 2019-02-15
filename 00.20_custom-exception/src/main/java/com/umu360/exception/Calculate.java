package com.umu360.exception;

public class Calculate {

    public void display(int i) throws CustomException{
        if(i == 0){
            throw new CustomException("该值不能为0.......");
        }
        else{
            System.out.println( i / 2);
        }
    }
}
