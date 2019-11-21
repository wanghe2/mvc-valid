package com.wang.dao;

import com.wang.form.UserBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
import java.util.Properties;

@Component
public class UserDao {

    private JdbcTemplate jdbcTemplate;

    public String getUserData1(){
        return "*****@@@@@@********######**********";
    }

    public String getUserData(){
       List<UserBean>users= jdbcTemplate.query("select name from userdata", new UserBean());
       StringBuilder userList=new StringBuilder();
       for(UserBean userBean: users){
           userList.append(userBean.getName()).append("----");
       }
        return userList.toString();
    }

    public UserDao() throws ClassNotFoundException {
      DriverManagerDataSource dataSource = new DriverManagerDataSource();
      dataSource.setDriverClassName("com.mysql.jdbc.Driver");
      dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/seckill");
      dataSource.setUsername("root");
      dataSource.setPassword("123456");
      jdbcTemplate=new JdbcTemplate(dataSource);
    }


}
