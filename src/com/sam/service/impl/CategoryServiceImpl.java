package com.sam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.CategoryMapper;
import com.sam.pojo.Category;
import com.sam.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryMapper categoryMapper;
	@Override
	public List<Category> findCategory() {
		return categoryMapper.findCategory();
	}

}
