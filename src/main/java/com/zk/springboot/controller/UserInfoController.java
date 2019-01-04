package com.zk.springboot.controller;

import com.zk.springboot.model.UserInfo;
import com.zk.springboot.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zpf
 * @date 2019/1/3 17:24
 */
@RestController
@RequestMapping("userInfo")
public class UserInfoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoController.class);

    @Resource
    private UserInfoService userInfoService;

    @PostMapping("/hello")
    public String hello(){
        return "hello SpringBoot";
    }

    @Value("${spring.datasource.password}")
    private String API_KEY;

    @PostMapping("/selectById")
    public UserInfo selectById(Integer id){
        LOGGER.info(API_KEY);
        return userInfoService.selectById(id);
    }


}
