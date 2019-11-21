package com.wang.form;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component
public class UserForm {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @NotEmpty(message = "用户名不能为空")
    @Length(max = 10,message = "用户的最大长度不能大于10")
    private String username;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @NotEmpty(message = "学校不能为空")
    @Length(max = 8,message = "学校的最大长度不能大于8")
    private String school;
}
