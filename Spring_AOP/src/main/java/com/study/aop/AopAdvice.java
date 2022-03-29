package com.study.aop;

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
        System.out.println("before");
    }
}
