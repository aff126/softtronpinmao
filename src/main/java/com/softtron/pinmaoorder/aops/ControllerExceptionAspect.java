package com.softtron.pinmaoorder.aops;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.softtron.pinmaoorders.exceptions.CommonException;

@ControllerAdvice
public class ControllerExceptionAspect {
//	日志管理
	public static final Logger logger = (Logger) LogManager.getLogger(ControllerExceptionAspect.class);
	
	@Bean(name = "resultmap")
	@Scope(value = "prototype")
	public Map<String, Object> getResultMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "200");
		map.put("message", "操作成功");
		return map;
	}
	
	
	@ExceptionHandler(value=Exception.class)
	@ResponseBody
	public Object getException(Throwable e) {
		logger.error(e.toString());
		Map<String,Object> map = getResultMap();
		map.put("code", "500");
		map.put("message", "操作失败");
		if(e instanceof CommonException) {
			CommonException ce = (CommonException) e;
			map.put("code", ce.getCode());
			map.put("message", ce.getDetail());
		}
		e.printStackTrace();


		return map;
	}
}
