package com.softtron.pinmaoorder.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softtron.pinmaoorder.dao.OrderDao;

@Service
public class OrderService {
	@Autowired
	OrderDao orderDao;
	@Transactional
	public void insert(Map map) {
		orderDao.insert(map);
//		int i=1/0;
		orderDao.insert(map);
	}
}
