package com.softtron.pinmaoorders.exceptions;

public class PermissionException extends CommonException {
//	统一使用的用户登录权限异常类
	public PermissionException(String code, String detail) {
		super(code, detail);
	}

}
