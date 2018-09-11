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
//        context = new ClassPathXmlApplicationContext("Sping-AspectJ.xml");
        context = new ClassPathXmlApplicationContext("Sping-AspectJ2.xml");
    }


    @Test
    public void shouldAnswerWithTrue2() {

        Userservice userserviceImpl = (Userservice) context.getBean("UserserviceImpl");
        userserviceImpl.drink();
    }
}
