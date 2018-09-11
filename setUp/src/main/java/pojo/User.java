package pojo;

import java.util.*;

public class User {
    private int stuid;
    private String stuname;
    private Student student;
    private int[] ints = new int[5];
    private List<String> list = new ArrayList<>();
    private Set<String> set = new HashSet<>();
    private Map map = new HashMap<>();
    private Properties properties = new Properties();

    @Override
    public String toString() {
        return "User{" +
                "stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                ", student=" + student +
                ", ints=" + Arrays.toString(ints) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int[] getInts() {
        return ints;
    }

    public void setInts(int[] ints) {
        this.ints = ints;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public User() {

    }

    public User(int stuid, String stuname) {

        this.stuid = stuid;
        this.stuname = stuname;

    }

    public User(int stuid, String stuname, Student student, int[] ints, List<String> list, Set<String> set, Map map, Properties properties) {

        this.stuid = stuid;
        this.stuname = stuname;
        this.student = student;
        this.ints = ints;
        this.list = list;
        this.set = set;
        this.map = map;
        this.properties = properties;
    }
}
