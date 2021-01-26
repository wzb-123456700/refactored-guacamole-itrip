package com.bdqn.controller;

import cn.itrip.dao.itripHotel.ItripHotelMapper;
import cn.itrip.pojo.ItripHotel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

@Controller
public class HotelContoller {
    @Resource
    ItripHotelMapper dao;
    @RequestMapping("/list")
    @ResponseBody
    public  Object getlist()throws Exception
    {

        Jedis jedis=new Jedis("192.168.111.129");
        jedis.auth("123456");
        jedis.setex("zheng",60*60*2,"zhong");

        ItripHotel cn=dao.getItripHotelById(new Long(1));
        return  cn;
    }
}
