package com.umu360.patterns.command;

/**
 * 建立命令接口,包含执行方法,命令对象必须要实现的,执行方法就是暴露的接口方法,提供于接收者调用.
 */
public interface Command {
    void execute();
}
