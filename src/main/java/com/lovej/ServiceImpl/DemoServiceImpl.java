package com.lovej.ServiceImpl;

import com.lovej.Dao.DemoDao;
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
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDao demoDao;

    public List<Demo> getDemoList(){
        return demoDao.getDemoList();
    }
}
