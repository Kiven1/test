package com.sam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sam.pojo.Product;
import com.sam.service.ProductService;

@Controller
@RequestMapping("product")
public class ProductController {

//	@Autowired
//	private CategoryService categoryService;
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/")
	public String showProduct(Integer category_id,Model model){
		model.addAttribute("porducts", productService.findProductByCategory(category_id));
		List<Product> list = productService.findProductByCategory(category_id);
		for (Product product : list) {
			System.out.println(product.getCategory().getCategory_name());
		}
		return "products";
	}
}
