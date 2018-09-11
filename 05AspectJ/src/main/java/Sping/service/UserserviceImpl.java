package Sping.service;

import Sping.dao.UserDao;

public class UserserviceImpl implements Userservice {

    //    书写dao对象 目标对象
    private UserDao dao;


    @Override
    public String eat() {
        System.out.println("进入的主业务吃");
        String result = dao.eat(); // 主业务
        return result;
    }

    @Override
    public String drink() {
        System.out.println("进入的主业务喝");
        String result = dao.drink(); // 主业务
        return result;
    }

    public UserDao getDao() {
        return dao;
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }
}
