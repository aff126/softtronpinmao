package com.softtron.pinmaoorder.util;

import com.softtron.pinmaoorders.exceptions.NotFileException;
import com.softtron.pinmaoorders.exceptions.PermissionException;

public class ExceptionUtil {
	public static final Exception NOTFILEEXCEPTION = new NotFileException("50001","文件不能为空");
	public static final PermissionException NOTUSEREXCEPTION = new PermissionException("60005", "用户未注册");
	public static final PermissionException LOGINERROREXCEPTION = new PermissionException("60006", "用户名或密码错误");
	public static final PermissionException NOTPMISSIONEXCEPTION= new PermissionException("60007", "无权限");
	public static final PermissionException NOTTOKEN = new PermissionException("60008", "token无效");
	public static final PermissionException NOLOGIN = new PermissionException("60001", "未登录");


}
