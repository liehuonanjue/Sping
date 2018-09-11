package Sping.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 前置增强
 */
public class MyBeforAdvice implements MethodBeforeAdvice {
    /**
     * @param method  需要增强的方法
     * @param objects 方法的参数
     * @param o       目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("进入的前置通知");
        System.out.println("method===》" + method.getName());
        System.out.println("o====>" + o.getClass().getName());

    }
}
