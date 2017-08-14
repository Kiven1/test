package com.sam.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.sam.pojo.Product;

@Repository
public interface ProductMapper {

	List<Product> findProductByCategory(@Param("category_id")Integer category_id);

	@Select("select * from product where pid=#{pid}")
	Product findProductById(Integer pid);
}
