package com.lovej.Controller;

import com.lovej.Entity.Demo;
import com.lovej.Service.ServiceImpl.RedisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: LinZhaoguan
 * Date: 2017/5/4
 * Time: 19:35
 * Email:linzhaoguan@astroway.net
 */
@Controller
public class TestController {
    @Autowired
    private RedisServiceImpl service;

    //添加
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public void test() {
        System.out.println("start..1...");
        Demo m = new Demo();
        m.setName("张一");
        m.setAge(18);
        m.setRedisKey("zhangsanKey01");
        service.put(m.getRedisKey(), m, -1);

        System.out.println("start...2..");
        Demo m2 = new Demo();
        m2.setName("张二");
        m2.setAge(18);
        m2.setRedisKey("zhangsanKey02");
        service.put(m2.getRedisKey(), m2, -1);

        System.out.println("start....3.");
        Demo m3 = new Demo();
        m3.setName("张三");
        m3.setAge(18);
        m3.setRedisKey("zhangsanKey03");
        service.put(m3.getRedisKey(), m3, -1);

        System.out.println("add success end...");
    }

    //查询所有对象
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public Object getAll() {
        return service.getAll();
    }

    //查询所有key
    @RequestMapping(value = "/getKeys", method = RequestMethod.GET)
    @ResponseBody
    public Object getKeys() {
        return service.getKeys();
    }

    //根据key查询
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Object get() {
        Demo m = new Demo();
        m.setRedisKey("zhangsanKey02");
        return service.get(m.getRedisKey());
    }

    //删除
    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    @ResponseBody
    public void remove() {
        Demo m = new Demo();
        m.setRedisKey("zhangsanKey01");
        service.remove(m.getRedisKey());
    }

    //判断key是否存在
    @RequestMapping(value = "/isKeyExists", method = RequestMethod.GET)
    @ResponseBody
    public void isKeyExists() {
        Demo m = new Demo();
        m.setRedisKey("zhangsanKey01");
        boolean flag = service.isKeyExists(m.getRedisKey());
        System.out.println("zhangsanKey01 是否存在: "+flag);
    }

    //查询当前缓存的数量
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @ResponseBody
    public Object count() {
        return service.count();
    }

    //清空所有key
    @RequestMapping(value = "/empty", method = RequestMethod.GET)
    @ResponseBody
    public void empty() {
        service.empty();
    }

}
