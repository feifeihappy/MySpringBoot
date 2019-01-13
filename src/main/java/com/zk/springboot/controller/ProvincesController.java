package com.zk.springboot.controller;

import com.zk.springboot.core.ret.RetResponse;
import com.zk.springboot.core.ret.RetResult;
import com.zk.springboot.model.ProvinceEntity;
import com.zk.springboot.service.ProvincesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zpf
 * @date 2019/1/11 16:09
 * 省市区
 */
@RestController
@RequestMapping(path = "/provinces")
public class ProvincesController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProvincesController.class);

    @Resource
    private ProvincesService provincesServiceImpl;



    @RequestMapping(path = "/queryCityName",method = RequestMethod.POST)
    public RetResult queryCityName(@RequestBody ProvinceEntity provinceEntity){

        List<ProvinceEntity> result = provincesServiceImpl.queryCityName(provinceEntity);
       return RetResponse.makeOKRsp(result);





    }























}
