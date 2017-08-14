package com.sam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sam.pojo.User;
import com.sam.service.CategoryService;
import com.sam.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private CategoryService categoryService;
	
	/**
	 * 请求登录页面
	 * @return
	 */
	@RequestMapping(value = "login",method = RequestMethod.GET)
	public String login(){
		return "login";
	}
	/**
	 * 登录验证
	 * @param uname 用户名
	 * @param upassword 密码
	 * @return
	 */
	@RequestMapping(value = "login",method = RequestMethod.POST)
	public String login(String uname,String upassword,Model model){
		User user = userService.findByUname(uname);
		System.out.println(user==null);
		if(user!=null){
			if(user.getUname().equals(uname)&&user.getUpassword().equals(upassword)){
				model.addAttribute("category",categoryService.findCategory());
				return "home";
			}
		}
		model.addAttribute("msg", "用户名或密码错误");
		return "login";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
