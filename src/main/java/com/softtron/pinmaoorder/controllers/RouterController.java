package com.softtron.pinmaoorder.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtron.pinmaoorder.domains.TOrder;
import com.softtron.pinmaoorder.service.OrderService;

@RestController
public class RouterController extends CommonControllers{
	@Autowired
	OrderService orderService;
	@RequestMapping(path = "/index1")
	public Map<String,Object> index() {
		resultMap.put("car", "new car");
		Map map = new HashMap();
		map.put("ordernum", "4484");
		orderService.insert(map);
		return resultMap;
	}
} 
