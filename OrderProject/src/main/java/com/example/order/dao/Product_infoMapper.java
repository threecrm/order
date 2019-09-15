package com.example.order.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.order.entity.Fenye;
import com.example.order.entity.Product_category;
import com.example.order.entity.Product_info;

@Mapper
public interface Product_infoMapper {
	/**
	 * 查询所有商品
	 * @param fenye
	 * @return
	 */
	List<Product_info> selectProduct_info(Fenye fenye);
	/**
	 * 查询总条数
	 * @param fenye
	 * @return
	 */
	Integer selectCount(Fenye fenye);
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
