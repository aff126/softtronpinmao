package com.softtron.pinmaoorder.controllers;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.softtron.pinmaoorder.domains.TCategory;
import com.softtron.pinmaoorder.service.CategoryService;

@RestController
public class CategoryControllers extends CommonControllers {
	@Autowired
	CategoryService categoryService;
//	查询所有category
	@RequestMapping(path="findallcategory")
	public Map FindallCategory() {
		Set set = categoryService.findallCategory();
		resultMap.put("category", set);
		System.out.println(resultMap.get("category"));
		return resultMap;
	}
	//插入categroy
	@PostMapping(path="insertcategory")
	public Map InsertCategory(TCategory category) {
		System.out.println(category);
		resultMap.put("categroyId", categoryService.insertCategory(category));
		return resultMap;
	}
//	更新category
	@PostMapping(path="updatacategory")
	public Map UpDateCategory(@RequestParam Map map) {
		System.out.println("map"+map);
		TCategory category = new TCategory();
		category.setCategoryId(Integer.parseInt(map.get("categoryId").toString()));
		category.setCategoryname((String) map.get("categoryname"));
		category.setParentId(Integer.parseInt(map.get("parentId").toString()));
		categoryService.updateCategory(category);
		return resultMap;
	}
//	删除
	@PostMapping(path="deleteCategory")
	public Map delectCategory(@RequestParam Map map) {
		TCategory category = new TCategory();
		category.setCategoryId(Integer.parseInt(map.get("categoryId").toString()));
		categoryService.deleteCategory(category.getCategoryId());
		return resultMap;
	}
}
