package com.example.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.order.dao.Product_categoryMapper;
import com.example.order.entity.Fenye;
import com.example.order.entity.Product_category;
@Service
public class Product_categoryServiceImp implements Product_categoryService {
	
	@Autowired
	private Product_categoryMapper product_categoryMapper;
    /**
     * 分页查询商品类目
     */
	@Override
	public List<Product_category> selectProduct_categorys(Fenye<Product_category> fenye) {
		// TODO Auto-generated method stub
		List<Product_category> selectProduct_category = product_categoryMapper.selectProduct_categorys(fenye);
		Integer selectCount = product_categoryMapper.selectProduct_categoryCount(fenye);
		fenye.setTotal(selectCount);
		return selectProduct_category;
	}

	@Override
	public Integer addProduct_category(Product_category product_category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateProduct_category(Product_category product_category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer delProduct_category(Integer category_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
