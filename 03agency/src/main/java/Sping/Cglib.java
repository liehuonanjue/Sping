package Sping;

import Sping.ind.Dog;
import Sping.ind.Zoology;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Cglib implements MethodInterceptor {

    public static void main(String[] args) {
        Cglib cglib = new Cglib();
        Zoology dog = (Zoology) cglib.CreateProxy(Dog.class);
        dog.zoology();
    }


    private Enhancer enhancer = new Enhancer();

    /**
     * 根据用户传递的委托类，返回一个代理类
     */
    public Object CreateProxy(Class clazz) {
//        设置公共的父类和接口
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * @param o           委托类
     * @param method      方法
     * @param objects     方法参数
     * @param methodProxy 方法代理
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("增强业务");

        Object result = methodProxy.invokeSuper(o, objects);
        return result;
    }


}
