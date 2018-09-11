package Sping;

import Sping.ind.Dog;
import Sping.ind.Zoology;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Hello world!
 */
public class App implements InvocationHandler {
    public static void main(String[] args) {
        App app = new App();
        Zoology zoology = (Zoology) app.creatrProxy(new Dog());
        zoology.zoology();
    }

    private Object object;

    public Object creatrProxy(Object object) {
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置增强");
        Object invoke = method.invoke(object, args);
        System.out.println("后置增强");
        return invoke;
    }
}
