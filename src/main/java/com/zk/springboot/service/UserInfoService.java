package com.zk.springboot.service;

import com.zk.springboot.model.UserInfo;

/**
 * @author zpf
 * @date 2019/1/4 9:44
 */
public interface UserInfoService {
    UserInfo selectById(Integer id);
}
