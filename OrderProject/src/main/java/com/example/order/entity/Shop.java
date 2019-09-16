package com.example.order.entity;

import org.springframework.stereotype.Component;

/**
 * 店铺实体类
 * */
@Component
public class Shop {
	/**店铺编号*/
	private String shopID;
	/**店铺名称*/
	private String shopName;
	/**店铺描述*/
	private String shopDescribe;
	/**商家用户id*/
	private Integer userID;
	/**店铺图片*/
	private String shopicon;
	/**用户*/
	private Users users;
	
	public String getShopID() {
		return shopID;
	}
	public void setShopID(String shopID) {
		this.shopID = shopID;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopDescribe() {
		return shopDescribe;
	}
	public void setShopDescribe(String shopDescribe) {
		this.shopDescribe = shopDescribe;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getShopicon() {
		return shopicon;
	}
	public void setShopicon(String shopicon) {
		this.shopicon = shopicon;
	}
	
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "Shop [shopID=" + shopID + ", shopName=" + shopName + ", shopDescribe=" + shopDescribe + ", userID="
				+ userID + ", shopicon=" + shopicon + ", users=" + users + "]";
	}
	
	
}
