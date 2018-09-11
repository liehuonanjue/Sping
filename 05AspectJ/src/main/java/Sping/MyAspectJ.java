package Sping;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspectJ {

    /**
     * execution ([访问权限类型] 返回值类型[完整限定名] 方法名称（参数）)
     * .. 类下面的内容
     */

    @Before("execution(* *..service..*.drink())")
    public void qbefore() {
        System.out.println("前置增强");
    }

    @After("execution(* *..service..*.drink())")
    public void After() {
        System.out.println("后置增强");
    }
}
