package com.sam.service.impl;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.OrderMapper;
import com.sam.dao.ProductMapper;
import com.sam.dao.UserMapper;
import com.sam.pojo.Order;
import com.sam.pojo.Product;
import com.sam.pojo.User;
import com.sam.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper orderMapper;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private ProductMapper productMapper;

	/**
	 * 创建新的订单
	 */
	@Override
	public Order newOrder(String uname, Integer pid) {
		System.out.println(uname+"  "+pid);
		//根据用户名uname得到商品信息
		User user = userMapper.findByUname(uname);
		//根据pid得到用户信息
		Product product = productMapper.findProductById(pid);
		Order order = new Order();
		order.setProduct(product);
		System.out.println(product.getPprice());
		order.setUser(user);
		order.setTotal(new BigDecimal(String.valueOf(product.getPprice())));
		order.setOtime(new Date());
		return order;
	}
}
