package com.wang.config;

import com.wang.form.UserBean;
import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.*;


/**
 * EnableWebMvc 是启用springMvc
 */
@Configuration
@EnableWebMvc
public class Config extends WebMvcConfigurerAdapter{

    @Bean("validator")
    public LocalValidatorFactoryBean localValidatorFactoryBean(){
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
        bean.setProviderClass(HibernateValidator.class);
        return bean;
    }

    @Bean("userBean")
    public UserBean userBean(){
        return new UserBean("cs合同系统");
    }

}
