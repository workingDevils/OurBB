package com.OurBB.OurBB.authentication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping(value={"", "/", "/login"})
    public ModelAndView login()
    {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("login.html");
        return modelAndView;
    }
}
