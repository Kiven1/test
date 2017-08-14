package com.sam.service;

import java.util.List;

import com.sam.pojo.Product;

public interface ProductService {

	List<Product> findProductByCategory(Integer category_id);
}
