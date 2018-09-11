package Sping.dao;

public class UserDaoImpl implements UserDao {
    @Override
    public String eat() {
        System.out.println("准备吃");
        return "方便面";
    }

    @Override
    public String drink() {
        System.out.println("准备喝");
        return "可乐";
    }
}
