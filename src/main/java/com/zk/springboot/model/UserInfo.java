package com.zk.springboot.model;
import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author zpf
 * @date 2019/1/4 9:26
 */
public class UserInfo {

    /**
     * 主键
     */
    private String id;

    /**
     * 用户名
     */
    private String userName;

    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
