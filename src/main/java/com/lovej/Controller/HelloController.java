package com.lovej.Controller;

import com.lovej.Service.DemoService;
import com.xiaoleilu.hutool.log.Log;
import com.xiaoleilu.hutool.log.LogFactory;
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

    Log log = LogFactory.get();

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/")
    public String login(ModelMap modelMap){
        modelMap.addAttribute("host","lovej");
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "hello")
    public String hello(){
        return "Hello World";
    }

    @ResponseBody
    @RequestMapping(value = "demo")
    public String demo(){
        log.info("easy log!!!");
        return demoService.getDemoList().toString();
    }

}
