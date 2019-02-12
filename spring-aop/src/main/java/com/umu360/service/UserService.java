package com.umu360.service;

public class UserService  implements IUserService {

    
    public void addUser() {
        System.out.println("增加用户信息");
        //这个异常信息的抛出，是为了测试after throwing的advice的
        throw new RuntimeException("测试异常");
    }
}
