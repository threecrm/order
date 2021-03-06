package com.example.order.service;

import java.util.List;

import com.example.order.entity.Fenye;
import com.example.order.entity.Product_category;
import com.example.order.entity.Product_info;

public interface Product_infoService {
	/**
	 * 查询所有
	 * @param fenye
	 * @return
	 */
	Fenye selectProduct_info(Fenye fenye);
	/**
	 * 查询商品类目
	 * @return
	 */
	List<Product_category> selectProduct_category();
	/**
	 * 添加商品
	 * @param product_info
	 * @return
	 */
	Integer addProduct_info(Product_info product_info);
	/**
	 * 修改商品
	 * @param product_info
	 * @return
	 */
	Integer updateProduct_info(Product_info product_info);
	/**
	 * 下架商品
	 * @param product_id
	 * @return
	 */
	Integer delProduct_info(Integer product_id);

}
