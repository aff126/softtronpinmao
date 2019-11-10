package com.softtron.pinmaoorder.domains;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class TCategory {
	private String categoryname;
	private int parentId;
	private int categoryId;
	private List<TCategory> children;

	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public List<TCategory> getChildren() {
		return children;
	}
	public void setChildren(List<TCategory> children) {
		this.children = children;
	}


	
	
} 
