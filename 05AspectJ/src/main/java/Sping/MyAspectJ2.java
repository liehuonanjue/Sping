package Sping;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

public class MyAspectJ2 {


    public void qbefore() {
        System.out.println("前置增强");
    }
}
