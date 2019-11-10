package com.softtron.pinmaoorder.dao;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.softtron.pinmaoorder.domains.TCategory;

public interface CategoryDao {
	public Set<Object> findallCategory();
	public int inserCategory(TCategory category);
	public void updataCategory(TCategory category);
	public void deleteCategory(Integer categoryId);
}
