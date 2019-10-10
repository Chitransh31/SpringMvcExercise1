package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("/")
    public ModelAndView index()
    {
        System.out.println("inside");
        User user = new User("Saurabh");

        ModelAndView mv = new ModelAndView("index");
        mv.addObject("name",user.getName());

        return mv;
    }

}
