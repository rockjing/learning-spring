package com.umu360.patterns.strategy.distribution.awards;

public class AwardsException extends  Exception {

    public AwardsException(){

    }

    public AwardsException(String message){
        super(message);
    }

    // 用指定的详细信息和原因构造一个新的异常
    public AwardsException(String message, Throwable cause){ super(message,cause); }

    //用指定原因构造一个新的异常
    public AwardsException(Throwable cause) { super(cause); }

}
