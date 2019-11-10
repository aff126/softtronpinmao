package com.softtron.pinmaoorder.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class CommonControllers {
	@Autowired
	@Qualifier("resultmap")
	Map<String,Object> resultMap;
	@Value("${upload.filePath}")
	protected String filePath;
}
