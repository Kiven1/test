package com.sam.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sam.pojo.Order;
import com.sam.service.OrderService;
import com.sam.service.ProductService;

@Controller
@RequestMapping("order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "{pid}/{uname}/buy",method = RequestMethod.GET)
	public String buyProduct(@PathVariable("pid")Integer pid,@PathVariable("uname")String uname,Model model){
		System.out.println(uname+"  "+pid);
		Order order = orderService.newOrder(uname,pid);
		model.addAttribute("order", order);
		return "buy";
	}
}
