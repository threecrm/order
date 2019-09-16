package com.example.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.entity.Fenye;
import com.example.order.entity.Product_category;
import com.example.order.entity.Product_info;
import com.example.order.service.Product_infoService;

@RestController
@CrossOrigin
public class Product_infoController {
	@Autowired
	private Product_infoService product_infoService;
	@Autowired
	private Fenye fenye;
	/**
	 * 查询所有
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/selectProduct_info")
	public Fenye selectProduct_info(Integer page,Integer rows,Product_info product_info) {
		fenye.setPage((page-1)*rows);
		fenye.setPageSize(rows);
		fenye.setProduct_info(product_info);
		fenye = product_infoService.selectProduct_info(fenye);
		return fenye;
	}
	/**
	 * 查询商品类目
	 * @return
	 */
	@RequestMapping("/selectProduct_category")
	public List<Product_category> selectProduct_category(){
		return product_infoService.selectProduct_category();
	}
	/**
	 * 添加商品
	 * @param product_category
	 * @param product_info
	 * @return
	 */
	@RequestMapping("/addProduct_info")
	public Integer addProduct_info(Product_category product_category,Product_info product_info) {
		product_info.setProduct_category(product_category);
		return product_infoService.addProduct_info(product_info);
	}
	/**
	 * 修改商品
	 * @param product_category
	 * @param product_info
	 * @return
	 */
	@RequestMapping("/updateProduct_info")
	public Integer updateProduct_info(Product_category product_category,Product_info product_info) {
		product_info.setProduct_category(product_category);
		return product_infoService.updateProduct_info(product_info);
	}
	
	/**
	 * 下架商品
	 * @param product_id
	 * @return
	 */
	@RequestMapping("/delProduct_info")
	public Integer delProduct_info(String product_id) {
		return product_infoService.delProduct_info(product_id);
	}

}
