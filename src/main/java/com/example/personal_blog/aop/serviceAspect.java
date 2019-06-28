package com.example.personal_blog.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Aspect
public class serviceAspect {

    @Pointcut("execution(* com.example.personal_blog.service.impl.*.*(..))")
    /*切点签名*/
    public void print() {

    }

    @Before("print()")
    public void beforeService(JoinPoint jp) throws Throwable {
        System.out.println("方法前切面："+jp.getTarget().getClass().getSimpleName()+"["+jp.getSignature().getName()+"]");
    }

    @After("print()")
    public void afterService(JoinPoint jp) throws Throwable {
        System.out.println("方法后切面："+jp.getTarget().getClass().getSimpleName()+"["+jp.getSignature().getName()+"]");
    }

    @AfterReturning("print()")
    public void afterReturningService(JoinPoint jp) throws Throwable {
        System.out.println("方法返回后切面："+jp.getTarget().getClass().getSimpleName()+"["+jp.getSignature().getName()+"]");
    }

    @AfterThrowing(throwing = "ex", value = "print()")
    public void doHandlerException(Throwable ex) {
        System.out.println("目标方法中抛出的异常："+ex);
    }

    @Around("print()")
    public Object runTimeAdvice(ProceedingJoinPoint pjp) throws Throwable {
        Date startTime =new Date();
        Object result = pjp.proceed(pjp.getArgs());
        Date endTime = new Date();
        System.out.println(pjp.getTarget().getClass().getSimpleName()+"["+pjp.getSignature().getName()+"] 的运行时间是："+
                (endTime.getTime() - startTime.getTime())+"毫秒");
        return result;
    }

}
