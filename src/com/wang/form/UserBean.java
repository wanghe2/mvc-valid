package com.wang.form;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserBean implements RowMapper<UserBean> {

    public String getName() {
        return name;
    }

    private String name;

    public UserBean(){

    }

    public UserBean(String name){
        this.name=name;
    }

    private void setName(String name){
        this.name=name;
    }

    @Override
    public UserBean mapRow(ResultSet resultSet, int i) throws SQLException {
        UserBean userBean=new UserBean();
        userBean.setName(resultSet.getString("name"));
        return userBean;
    }
}
