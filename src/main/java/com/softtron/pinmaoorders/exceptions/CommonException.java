package com.softtron.pinmaoorders.exceptions;

import org.apache.shiro.authc.AuthenticationException;

public class CommonException extends AuthenticationException{
	protected String code;
	protected String detail;
	public CommonException(String code, String detail) {
		super();
		this.code = code;
		this.detail = detail;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
}
