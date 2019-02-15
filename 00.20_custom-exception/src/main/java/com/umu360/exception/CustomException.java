package com.umu360.exception;

/**
 * Java自定义异常的使用要经历如下四个步骤：
 *
 *       1、定义一个类继承Throwable或其子类。
 *
 *       2、添加构造方法(当然也可以不用添加，使用默认构造方法)。
 *
 *       3、在某个方法类抛出该异常。
 *
 *       4、捕捉该异常。
 *
 *
 */
public class CustomException extends Exception{

    public CustomException(){

    }

    public CustomException(String message){
        super(message);
    }

    // 用指定的详细信息和原因构造一个新的异常
    public CustomException(String message, Throwable cause){ super(message,cause); }

    //用指定原因构造一个新的异常
    public CustomException(Throwable cause) { super(cause); }
}

