package Sping.advice;


import org.springframework.aop.ThrowsAdvice;

/**
 * 异常通知
 */
public class MyExeptionAdvice implements ThrowsAdvice {
    public void afterThrowing(Exception ex) {
        System.out.println("进入了异常");
        System.out.println("异常信息======》" + ex.getMessage());
    }
}
