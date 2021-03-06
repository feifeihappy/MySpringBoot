package com.zk.springboot.service.impl;

import com.zk.springboot.Exception.BusinessException;
import com.zk.springboot.core.common.AbstractService;
import com.zk.springboot.dao.UserInfoMapper;
import com.zk.springboot.model.UserInfoEntity;
import com.zk.springboot.service.UserInfoService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author zpf
 * @date 2019/1/4 9:45
 */
@Component
public class UserInfoServiceImpl extends AbstractService<UserInfoEntity> implements UserInfoService {


    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfoEntity selectById(String id) {
        UserInfoEntity userInfo = userInfoMapper.selectByPrimaryKey(id);
        if (userInfo == null) {
            throw new BusinessException("暂无该用户");
        }
        return userInfo;

    }
}
