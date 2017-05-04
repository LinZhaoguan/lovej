package com.lovej.Service.ServiceImpl;

import com.lovej.Entity.Demo;
import com.lovej.Service.RedisService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: LinZhaoguan
 * Date: 2017/5/4
 * Time: 19:33
 * Email:linzhaoguan@astroway.net
 */
@Service
public class RedisServiceImpl extends RedisService<Demo> {
    private static final String REDIS_KEY = "TEST_REDIS_KEY";

    @Override
    protected String getRedisKey() {
        return this.REDIS_KEY;
    }
}
