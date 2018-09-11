package service;

import dao.UserImpl;
import dao.Userdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserserviceImpl implements Userservice {
    //    Userdao userdao = new UserImpl();
    @Autowired
    @Qualifier("userdao")
    private Userdao userdao;

    public UserserviceImpl() {
        System.out.println("2");
    }

    public void setUserdao(Userdao userdao) {
        System.out.println(" Sping容器");
        this.userdao = userdao;
    }

    @Override
    public void hell() {
        System.out.println("=========");
        userdao.hell();
    }
}
