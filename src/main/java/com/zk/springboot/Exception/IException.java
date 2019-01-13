package com.zk.springboot.Exception;

public interface IException {
	String getErrorCode();

	void setErrorArguments(Object... paramVarArgs);

	Object[] getErrorArguments();

}