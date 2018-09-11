package pojo;

import java.io.Serializable;

public class User implements Serializable {
    private int stuid;
    private String stuname;

    @Override
    public String toString() {
        return "User{" +
                "stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                '}';
    }

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public User() {

    }

    public User(int stuid, String stuname) {

        this.stuid = stuid;
        this.stuname = stuname;
    }


}
