package com.sam.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.sam.pojo.User;

@Repository("userMapper")
public interface UserMapper {

	@Select("select * from user where uname=#{uname}")
	User findByUname(String uname);
}
