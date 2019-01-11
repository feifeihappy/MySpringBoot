package com.zk.springboot.service;

import com.zk.springboot.model.UserInfoEntity;

/**
 * @author zpf
 * @date 2019/1/4 9:44
 */
public interface UserInfoService {
    UserInfoEntity selectById(Integer id);
}
