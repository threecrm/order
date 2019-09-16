package com.example.order.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.order.dao.Product_infoMapper;
import com.example.order.entity.Fenye;
import com.example.order.entity.Product_category;
import com.example.order.entity.Product_info;
@Service
public class Product_infoServiceImp implements Product_infoService {
	
	@Autowired
	private Product_infoMapper product_infoMapper;

	@Override
	public Fenye selectProduct_info(Fenye fenye) {
		// TODO Auto-generated method stub
		List<Product_info> selectProduct_info = product_infoMapper.selectProduct_info(fenye);
		Integer selectCount = product_infoMapper.selectCount(fenye);
		fenye.setRows(selectProduct_info);
		fenye.setTotal(selectCount);
		return fenye;
		
		/*
		 * UUID randomUUID = UUID.randomUUID(); System.out.println(randomUUID);
		 */
		
	}
    /**
     * 查询商品类目
     */
	@Override
	public List<Product_category> selectProduct_category() {
		// TODO Auto-generated method stub
		return product_infoMapper.selectProduct_category();
	}
    /**
     * 添加商品
     */
	@Override
	public Integer addProduct_info(Product_info product_info) {
		// TODO Auproduct_idto-generated method stub
		UUID randomUUID = UUID.randomUUID();
		String randomUUID1 = randomUUID.toString();
		product_info.setProduct_id(randomUUID1);
		return product_infoMapper.addProduct_info(product_info);
		
	}
    /**
     * 修改商品
     */
	@Override
	public Integer updateProduct_info(Product_info product_info) {
		// TODO Auto-generated method stub
		return product_infoMapper.updateProduct_info(product_info);
	}
	
    /**
     * 下架商品
     */
	@Override
	public Integer delProduct_info(String product_id) {
		// TODO Auto-generated method stub
		return product_infoMapper.delProduct_info(product_id);
	}


}
