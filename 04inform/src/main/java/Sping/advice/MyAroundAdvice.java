package Sping.advice;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

public class MyAroundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("进入环绕增强1");
        Object result = methodInvocation.proceed(); //执行主业务方法
        System.out.println("进入环绕增强2");
        result = "蛋炒饭";
        return result;
    }
}
