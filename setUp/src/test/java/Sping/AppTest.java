package Sping;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import pojo.Student;
import pojo.User;
import service.Userservice;
import service.UserserviceImpl;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /*    @Test
        public void Text() {
            UserserviceImpl userservice = new UserserviceImpl();
            userservice.hell();
        }*/
//    全部加载
    @Test
    public void Text() {
//        适用于web项目 类似于数据源
        ApplicationContext context = new ClassPathXmlApplicationContext("Sping-base.xml");
        System.out.println("==============================");
        Userservice userservice = context.getBean(Userservice.class);
        userservice.hell();
    }

    //用到那些加载那些
    @Test
    public void Text2() {
//一般手机端使用
        XmlBeanFactory context = new XmlBeanFactory(new ClassPathResource("Sping-base.xml"));
        System.out.println("==============================");
        Userservice userservice = context.getBean(Userservice.class);
        userservice.hell();
    }

    //    绝对路径
    @Test
    public void Text3() {
//        一般web使用
        ApplicationContext context = new FileSystemXmlApplicationContext("G:\\project\\Sping\\setUp\\src\\main\\Sping-base.xml");
        System.out.println("==============================");
        Userservice userservice = context.getBean(Userservice.class);
        userservice.hell();
    }

    /**
     * 验证对象是单例的
     */
    @Test
    public void TextStu() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Sping-base.xml");
        System.out.println("==============================");
        User user1 = (User) context.getBean("user4");
        System.out.println(user1);

    }

    @Test
    public void TextStudent() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Sping-base.xml");
        System.out.println("==============================");
        User user1 = (User) context.getBean("user5");
        System.out.println(user1);
        System.out.println("集合");
        for (String s : user1.getList()) {
            System.out.println(s);
        }
        System.out.println("数组");
        for (int s : user1.getInts()) {
            System.out.println(s);
        }
        System.out.println("map集合");
        for (Object o : user1.getMap().keySet()) {
            System.out.println(user1.getMap().get(o));
        }
    }


    @Test
    public void Tex4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Sping-note.xml");
        System.out.println("==============================");
        User bean = context.getBean(User.class);
        System.out.println(bean.getStudent());

    }


}

