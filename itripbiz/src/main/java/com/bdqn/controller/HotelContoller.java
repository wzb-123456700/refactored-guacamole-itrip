package com.bdqn.controller;

import cn.itrip.common.Dto;
import cn.itrip.common.DtoUtil;
import cn.itrip.dao.itripAreaDic.ItripAreaDicMapper;
import cn.itrip.dao.itripLabelDic.ItripLabelDicMapper;
import cn.itrip.pojo.ItripAreaDic;
import cn.itrip.pojo.ItripLabelDic;
import cn.itrip.pojo.ItripUserVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Properties;

@Controller
public class HotelContoller {
    @Resource
    ItripAreaDicMapper dao;
    @Resource
    ItripLabelDicMapper da1;

    @RequestMapping(value="/api/hotel/queryhotcity/{id}",method = RequestMethod.GET,produces ="application/json;charset=utf-8" )
    public @ResponseBody Dto re(@PathVariable("id")int id )throws Exception{
        List<ItripAreaDic> list=dao.ishot(id);
        return DtoUtil.returnDataSuccess(list);
    };
    @RequestMapping(value="/api/hotel/queryhotelfeature",method = RequestMethod.GET,produces ="application/json;charset=utf-8" )
    public @ResponseBody Dto re1( )throws Exception{
        List<ItripLabelDic> list=da1.list();
        return DtoUtil.returnDataSuccess(list);
    };


}
