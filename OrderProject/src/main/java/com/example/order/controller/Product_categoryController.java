package com.example.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.entity.Fenye;
import com.example.order.entity.Product_category;
import com.example.order.service.Product_categoryService;

@RestController
@CrossOrigin
public class Product_categoryController {
	
	@Autowired
	private Product_categoryService product_categoryService;
	@Autowired
	private Fenye<Product_category> fenye;
	
	@RequestMapping("/selectProduct_categorys")
	public Fenye<Product_category> selectProduct_categorys(Integer page,Integer rows) {
		fenye.setPage((page-1)*rows);
		fenye.setPageSize(rows);
		List<Product_category> selectProduct_category =  product_categoryService.selectProduct_categorys(fenye);
		fenye.setRows(selectProduct_category);
		return fenye;
	}

}
