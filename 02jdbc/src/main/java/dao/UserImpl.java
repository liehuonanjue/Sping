package dao;


import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import pojo.User;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserImpl extends JdbcDaoSupport implements Userdao {


    @Override
    public int add() {
        String sql = "INSERT USER(userName)\n" +
                "VALUES\t('sss')";
        return getJdbcTemplate().update(sql);
    }

    @Override
    public int delect(Serializable id) {
        String sql = "DELETE FROM USER WHERE id =?";
        return getJdbcTemplate().update(sql, id);
    }

    @Override
    public int update(User user) {
        String sql = "UPDATE  USER SET userName=? WHERE id=?";
        return getJdbcTemplate().update(sql, user.getStuname(), user.getStuid());
    }

    @Override
    public List<User> findAll() {
        String sql = "SELECT * FROM user";
        return getJdbcTemplate().query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int i) throws SQLException {
                User user = new User();
                user.setStuname(rs.getString("userName"));
                return user;

            }
        });
    }


}
