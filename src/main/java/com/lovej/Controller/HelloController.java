package com.lovej.Controller;

import com.lovej.Service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: Linzhaoguan
 * Date: 2017/4/30
 * Time: 23:55
 */
@Controller
public class HelloController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/")
    public String login(ModelMap modelMap){
        modelMap.addAttribute("host","lovej");
        return "index";
    }

    @RequestMapping(value = "hello")
    public String hello(){
        return "Hello World";
    }

    @ResponseBody
    @RequestMapping(value = "demo")
    public String demo(){
        return demoService.getDemoList().toString();
    }

}
