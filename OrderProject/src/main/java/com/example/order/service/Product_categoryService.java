package com.example.order.service;

import java.util.List;

import com.example.order.entity.Fenye;
import com.example.order.entity.Product_category;

public interface Product_categoryService {
	/**
	 * 分页查询商品类目
	 * @param fenye
	 * @return
	 */
	List<Product_category> selectProduct_categorys(Fenye<Product_category> fenye);
	/**
	 * 添加商品类目
	 * @param product_category
	 * @return
	 */
	Integer addProduct_category(Product_category product_category);
	/**
	 * 修改商品类目
	 * @param product_category
	 * @return
	 */
	Integer updateProduct_category(Product_category product_category);
	/**
	 * 删除商品类目
	 * @param category_id
	 * @return
	 */
	Integer delProduct_category(Integer category_id);

}
