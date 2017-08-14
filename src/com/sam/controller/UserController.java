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
	 * �����¼ҳ��
	 * @return
	 */
	@RequestMapping(value = "login",method = RequestMethod.GET)
	public String login(){
		return "login";
	}
	/**
	 * ��¼��֤
	 * @param uname �û���
	 * @param upassword ����
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
		model.addAttribute("msg", "�û������������");
		return "login";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
