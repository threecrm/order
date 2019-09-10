package com.example.order.entity;

import java.math.BigDecimal;

public class Product_info {
	/***/
	private String product_id;
	/**商品名称*/
	private String product_name;
	/**商品单价*/
	private BigDecimal product_price;
	/**库存*/
	private Integer product_stock;
	/**描述*/
	private String product_description;
	/**小图*/
	private String product_icon;
	/**类目编号*/
	private Integer category_type;
	/**创建时间*/
	private String create_time;
	/**修改时间*/
	private String update_time;
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public BigDecimal getProduct_price() {
		return product_price;
	}
	public void setProduct_price(BigDecimal product_price) {
		this.product_price = product_price;
	}
	public Integer getProduct_stock() {
		return product_stock;
	}
	public void setProduct_stock(Integer product_stock) {
		this.product_stock = product_stock;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public String getProduct_icon() {
		return product_icon;
	}
	public void setProduct_icon(String product_icon) {
		this.product_icon = product_icon;
	}
	public Integer getCategory_type() {
		return category_type;
	}
	public void setCategory_type(Integer category_type) {
		this.category_type = category_type;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	@Override
	public String toString() {
		return "Product_info [product_id=" + product_id + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_stock=" + product_stock + ", product_description=" + product_description
				+ ", product_icon=" + product_icon + ", category_type=" + category_type + ", create_time=" + create_time
				+ ", update_time=" + update_time + "]";
	}
	
}
