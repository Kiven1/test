package com.sam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.ProductMapper;
import com.sam.pojo.Product;
import com.sam.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductMapper productMapper;

	@Override
	public List<Product> findProductByCategory(Integer category_id) {
		return productMapper.findProductByCategory(category_id);
	}

}
