package Sping.advice;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class MyAfterAdvice implements AfterReturningAdvice {
    /**
     * @param o       主业务返回值
     * @param method  主业务方法
     * @param objects 主业务参数
     * @param o1      目标对象
     * @throws Throwable
     */

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了后置通知+++++++++++++++++++");
        System.out.println("主业务的返回值===》" + o);
        o = "蛋炒饭";
    }
}
