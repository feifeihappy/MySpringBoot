package com.zk.springboot.controller;

import com.zk.springboot.core.ret.RetResponse;
import com.zk.springboot.core.ret.RetResult;
import com.zk.springboot.service.RedisService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zpf
 * @date 2019/1/22 9:29
 */
@RestController
@RequestMapping("redis")
public class RedisController {

    @Resource
    private RedisService redisServiceImpl;

    @PostMapping("/setRedis")
    public RetResult<String> setRedis(String name) {
        redisServiceImpl.set("name",name);
        return RetResponse.makeOKRsp(name);
    }

    @PostMapping("/getRedis")
    public RetResult<String> getRedis() {
        String name = redisServiceImpl.get("name");
        return RetResponse.makeOKRsp(name);
    }


}
