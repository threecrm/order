package com.example.order.entity;

import org.springframework.stereotype.Component;
/**
 * 地址类
 * @author admin
 *
 */
@Component
public class Customer_addr {
	/**地址编号*/
	private Integer customer_addr_id;
	/**顾客id*/
	private Integer customer_id;
	/**邮编*/
	private String zip;
	/**省*/
	private String province;
	/**市*/
	private String city;
	/**县*/
	private String district;
	/**详细描述*/
	private String address;
	/**是否默认地址*/
	private Integer is_default;
	/**最后修改时间*/
	private String modified_time;
	/**地址*/
	private Customer_inf customer_inf;
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
	public Integer getIs_default() {
		return is_default;
	}
	public void setIs_default(Integer is_default) {
		this.is_default = is_default;
	}
	public String getModified_time() {
		return modified_time;
	}
	public void setModified_time(String modified_time) {
		this.modified_time = modified_time;
	}
	public Customer_inf getCustomer_inf() {
		return customer_inf;
	}
	public void setCustomer_inf(Customer_inf customer_inf) {
		this.customer_inf = customer_inf;
	}
	@Override
	public String toString() {
		return "Customer_addr [customer_addr_id=" + customer_addr_id + ", customer_id=" + customer_id + ", zip=" + zip
				+ ", province=" + province + ", city=" + city + ", district=" + district + ", address=" + address
				+ ", is_default=" + is_default + ", modified_time=" + modified_time + ", customer_inf=" + customer_inf
				+ "]";
	}
	
}
