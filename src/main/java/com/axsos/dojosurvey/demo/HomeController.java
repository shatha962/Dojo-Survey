package com.axsos.dojosurvey.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "redirect:/index.html";
    }
    @RequestMapping(value = "/submitted", method = RequestMethod.POST)
    public String submitData(@RequestParam(value = "name") String name,
                             @RequestParam(value = "location") String location,
                             @RequestParam(value = "language") String language,
                             @RequestParam(value = "comment")String comment,
                             Model model,
                             HttpSession session){
        session.setAttribute("name", name);
        session.setAttribute("location", location);
        session.setAttribute("language", language);
        session.setAttribute("comment", comment);
        return "redirect:/show";
    }
    @RequestMapping("/show")
    public String show() {
        return "show.jsp";
    }
}
