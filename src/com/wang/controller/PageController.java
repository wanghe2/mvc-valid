package com.wang.controller;

import com.wang.form.UserBean;
import com.wang.form.UserForm;
import com.wang.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.validation.Valid;

@Controller
public class PageController {
    @Resource
    private UserBean userBean;

    @Resource
    private UserService userService;


    @RequestMapping("page")
    public String page(@Valid @ModelAttribute("userForm") UserForm userForm, BindingResult bindingResult, Model model){
        System.err.println("********姓名："+userForm.getUsername()+"  -- 学校："+userForm.getSchool());
        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            String validMess = fieldError.getDefaultMessage();
            model.addAttribute("errors", validMess);
            return "error";
        }
        return "page";
    }

    @RequestMapping("languageChange")
    public String languageChange(Model model){
        return "languageChange";
    }

    @RequestMapping("userData")
    public String userData(Model model){
         String data=userService.getUserData()+"   "+userBean.getName();
         model.addAttribute("name",data);
         return "page";
    }
}
