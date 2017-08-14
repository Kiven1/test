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
	 * �����µĶ���
	 */
	@Override
	public Order newOrder(String uname, Integer pid) {
		System.out.println(uname+"  "+pid);
		//�����û���uname�õ���Ʒ��Ϣ
		User user = userMapper.findByUname(uname);
		//����pid�õ��û���Ϣ
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
