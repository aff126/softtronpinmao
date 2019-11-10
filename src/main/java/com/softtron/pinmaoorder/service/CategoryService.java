package com.softtron.pinmaoorder.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtron.pinmaoorder.dao.CategoryDao;
import com.softtron.pinmaoorder.domains.TCategory;

@Service
public class CategoryService {
	@Autowired
	CategoryDao categoryDao;
	public Set findallCategory() {
		//在这一层对dao层返回的数据进行处理
		Set set = categoryDao.findallCategory();
		return set;
	}
	public int insertCategory(TCategory category) {
		Set set = new HashSet();
		set.add(category);
		TCategory categoryId = new TCategory();
		categoryDao.inserCategory(category);
		return category.getCategoryId();
	}
	public void updateCategory(TCategory category) {
		categoryDao.updataCategory(category);
	}
	public void deleteCategory(int categoryId) {
		categoryDao.deleteCategory(categoryId);
	}
}
