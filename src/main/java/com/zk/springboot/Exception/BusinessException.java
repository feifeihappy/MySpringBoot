package com.zk.springboot.Exception;

import java.io.Serializable;

/**
 * @Description: 业务异常类
 * @Author: zpf
 * @CreateDate: 2018/4/11 15:59
 * @Version: 1.0
 */
public class BusinessException extends RuntimeException implements IException,
        Serializable {

    protected String errCode;
    private String errMsg;
    private transient Object[] arguments;

    public BusinessException() {

    }

    public BusinessException(String msg) {
        super(msg);
        this.errMsg = msg;
    }

    public BusinessException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public BusinessException(String code, String msg) {
        super(msg);
        this.errMsg = msg;
        this.errCode = code;
    }


    public BusinessException(String code, Object... args) {
        this.errCode = code;
        this.arguments = args;
    }

    public BusinessException(String code, String msg, Object... args) {
        super(msg);
        this.errMsg = msg;
        this.errCode = code;
        this.arguments = args;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public String getErrorCode() {
        // TODO Auto-generated method stub
        return errCode;
    }

    public void setErrorArguments(Object... paramVarArgs) {
        // TODO Auto-generated method stub
        this.arguments = paramVarArgs;
    }

    public Object[] getErrorArguments() {
        // TODO Auto-generated method stub
        return this.arguments;
    }
}