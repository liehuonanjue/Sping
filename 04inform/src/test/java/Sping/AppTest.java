package Sping;

import static org.junit.Assert.assertTrue;

import Sping.service.Userservice;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    ApplicationContext context = null;

    @Before
    public void before() {
//   通知     context = new ClassPathXmlApplicationContext("Sping-Student.xml");
//顾问
        context = new ClassPathXmlApplicationContext("Sping-proxy.xml");
    }

    @Test
    public void shouldAnswerWithTrue() {
//        首先 按照我们之前的逻辑查询service
//        Userservice u = (Userservice) context.getBean("UserserviceImpl");
        Userservice u = (Userservice) context.getBean("UserProxyFactory");
        String eat = u.eat();
        System.out.println(eat);

    }


    @Test
    public void shouldAnswerWithTrue2() {

        Userservice userserviceImpl = (Userservice) context.getBean("UserserviceImpl");
        userserviceImpl.drink();
    }
}
