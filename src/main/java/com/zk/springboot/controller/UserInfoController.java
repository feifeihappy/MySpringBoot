package com.zk.springboot.controller;

import com.zk.springboot.core.ret.RetResponse;
import com.zk.springboot.core.ret.RetResult;
import com.zk.springboot.model.UserInfoEntity;
import com.zk.springboot.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zpf
 * @date 2019/1/3 17:24
 */
@RestController
@RequestMapping("test")
public class UserInfoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoController.class);

    @Resource
    private UserInfoService userInfoService;

    @RequestMapping(path = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello SpringBoot";
    }

    /**
     * @GetMapping 请求
     * @return
     */
    @GetMapping("/get")
    public RetResult get(){
        return RetResponse.makeOKRsp();
    }
    @PostMapping("/selectById")
    public RetResult selectById(Integer id){

        UserInfoEntity userInfoEntity = userInfoService.selectById(id);
        return RetResponse.makeOKRsp(userInfoEntity);
    }


}
