package com.umu360.service;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

/**
 * @author lilin
 *
 */
@Aspect
@Service
public class AspectAop {

    /**
     * 申明切点，同时配置将要被aop过滤的业务类
     */
    @Pointcut("execution (* com.umu360.service.UserService.addUser(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void doBefore() {
        System.out.println("doBefore advice");
    }

    @AfterReturning("pointcut()")
    public void doAfterReturning() {
        System.out.println("doAfterReturning advice");
    }

    @After("pointcut()")
    public void doAfter() {
        System.out.println("doAfter advice");
    }

    @AfterThrowing("pointcut()")
    public void doAfterThrowing() {
        System.out.println("doAfterThrowing advice");
    }

    @Around("pointcut()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("doAround advice start");
        Object result = pjp.proceed();
        System.out.println("doAround advice end");
        return result;
    }
}
