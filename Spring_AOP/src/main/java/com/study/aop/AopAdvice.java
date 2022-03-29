package com.study.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author David
 * @Title:
 * @Package
 * @Description:
 * @date 2022/3/2821:42
 */
// 1.定义一个通知类 在类中定义共性功能的方法
public class AopAdvice {
    public void  function(){
        System.out.println("共性功能");
    }
    public void  before(){
        System.out.println("before......");
    }

    public void  after(){
        System.out.println("after");
    }
    public void  afterReturing(){
        System.out.println("afterReturing");
    }
    public void  afterThrowing(){
        System.out.println("afterThrowing");
    }
    public void  around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before111111111111");
        pjp.proceed();
        System.out.println("after22222222222222");
    }

    public void  canshubefore(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println("before......"+args[0]);
    }
    public void  canshubefore1(int x){
        System.out.println("before (int)......"+ x);
    }



    public void  afterReturingTest(Object ret){
        System.out.println("afterReturingTest..."+ret);
    }
    public Object  aroundreturnTest(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aroundreturnTest before 111111111111");
        Object ret = pjp.proceed();
        System.out.println("aroundreturnTest after 2222222222222");
        return ret;

    }


    public void  afterThrowingTest(Throwable t){
        System.out.println("afterThrowingTest is runing" +t.getMessage());
    }
    public Object  aroundThrowingTest(ProceedingJoinPoint pjp)  {
        System.out.println("aroundThrowingTest before 111111111111");
        Object ret = null;
        try {
            ret = pjp.proceed();
        } catch (Throwable throwable) {
            System.out.println("aroundThrowingTest "+throwable.getMessage());
        }
        System.out.println("aroundThrowingTest after 22222222222222");
        return ret;

    }
}