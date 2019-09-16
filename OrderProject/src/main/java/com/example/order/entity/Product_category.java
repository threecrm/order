package com.example.order.entity;

import org.springframework.stereotype.Component;

@Component
public class Product_category {
	/***/
	private Integer category_id;
	/** 类目名字 */
	private String category_name;
	/** 店铺id */
	private String catShopID;

	/** 创建时间 */
	private String create_time;
	/** 修改时间 */
	private String update_time;
	/** 分类所属店铺 */
	private Shop shop;
	
	public Integer getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getCatShopID() {
		return catShopID;
	}
	public void setCatShopID(String catShopID) {
		this.catShopID = catShopID;
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
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	@Override
	public String toString() {
		return "Product_category [category_id=" + category_id + ", category_name=" + category_name + ", catShopID="
				+ catShopID + ", create_time=" + create_time + ", update_time=" + update_time + ", shop=" + shop + "]";
	}

}
