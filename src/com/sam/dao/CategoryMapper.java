package com.sam.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.sam.pojo.Category;

@Repository
public interface CategoryMapper {

	@Select("select * from category")
	List<Category> findCategory();
}
