package com.lovej.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.lovej.Entity.Demo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Linzhaoguan
 * Date: 2017/5/1
 * Time: 22:48
 */
@Mapper
public interface DemoMapper extends BaseMapper<Demo> {

}
