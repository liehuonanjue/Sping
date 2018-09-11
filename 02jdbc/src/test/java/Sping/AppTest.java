package Sping;

import static org.junit.Assert.assertTrue;

import dao.Userdao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

import java.io.Serializable;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {

    Userdao dao = null;

    @Before
    public void Before() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        dao = context.getBean(Userdao.class);
    }

    @Test
    public void add() {
        System.out.println("==============1================");
        dao.add();
        System.out.println("==============2================");
    }


    @Test
    public void delect() {
        System.out.println("==============1================");
        dao.delect(2);
        System.out.println("==============2================");
    }

    @Test
    public void update() {
        System.out.println("==============1================");
        User user = new User();
        user.setStuid(2);
        user.setStuname("ddd");
        dao.update(user);
        System.out.println("==============2================");
    }

    @Test
    public void select() {
        System.out.println("==============1================");
        List<User> all = dao.findAll();
        for (User user : all) {
            System.out.println(user);
        }
        System.out.println("==============2================");
    }
}
