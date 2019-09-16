package com.example.order.entity;

import org.springframework.stereotype.Component;

/**
 * 顾客类*/
@Component
public class Customer_inf {
	private Integer customer_addr_id;
	private Integer customer_id;
	private String zip;
	private String province;
	private String city;
	private String district;
	private String address;
	private String is_default;
	private String modified_time;
	public Integer getCustomer_addr_id() {
		return customer_addr_id;
	}
	public void setCustomer_addr_id(Integer customer_addr_id) {
		this.customer_addr_id = customer_addr_id;
	}
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIs_default() {
		return is_default;
	}
	public void setIs_default(String is_default) {
		this.is_default = is_default;
	}
	public String getModified_time() {
		return modified_time;
	}
	public void setModified_time(String modified_time) {
		this.modified_time = modified_time;
	}
	@Override
	public String toString() {
		return "Customer_inf [customer_addr_id=" + customer_addr_id + ", customer_id=" + customer_id + ", zip=" + zip
				+ ", province=" + province + ", city=" + city + ", district=" + district + ", address=" + address
				+ ", is_default=" + is_default + ", modified_time=" + modified_time + "]";
	}
	
}
