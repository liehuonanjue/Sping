package dao;


import pojo.User;

import java.io.Serializable;
import java.util.List;

public interface Userdao {

    int add();

    int delect(Serializable id);

    int update(User user);

    List<User> findAll();


}
