package com.zk.springboot.dao;

import com.zk.springboot.model.UserInfo;
import org.apache.ibatis.annotations.Param;

/**
 * @author zpf
 * @date 2019/1/4 9:41
 */
public interface UserInfoMapper {

    UserInfo selectById(@Param("id") Integer id);
}
