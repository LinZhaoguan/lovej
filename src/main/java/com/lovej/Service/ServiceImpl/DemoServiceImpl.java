package com.lovej.Service.ServiceImpl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lovej.Mapper.DemoMapper;
import com.lovej.Entity.Demo;
import com.lovej.Service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Linzhaoguan
 * Date: 2017/5/1
 * Time: 22:56
 */
@Service
public class DemoServiceImpl  extends ServiceImpl<DemoMapper, Demo> implements DemoService {


    @Override
    public List<Demo> getDemoList() {
        /*Demo demo = new Demo();
        demo.setId(6);
        demo.setName("susan");
        demo.setAge(22);
        baseMapper.insert(demo);*/
        return baseMapper.selectList(null);
    }
}
