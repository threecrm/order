package com.example.order.entity;

import java.math.BigDecimal;

public class Order_master {
	/**订单id*/
	private String order_id;
	/**买家名字*/
	private String buyer_name;
	/**买家电话*/
	private String buyer_phone;
	/**买家地址*/
	private String buyer_address;
	/**买家微信openID*/
	private String buyer_openid;
	/**订单总金额*/
	private BigDecimal order_amount;
	/**订单状态,默认0新下单*/
	private Boolean order_status;
	/**支付状态，默认0未支付*/
	private Boolean pay_status;
	/**创建时间*/
	private String create_time;
	/**修改时间*/
	private String update_time;
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getBuyer_name() {
		return buyer_name;
	}
	public void setBuyer_name(String buyer_name) {
		this.buyer_name = buyer_name;
	}
	public String getBuyer_phone() {
		return buyer_phone;
	}
	public void setBuyer_phone(String buyer_phone) {
		this.buyer_phone = buyer_phone;
	}
	public String getBuyer_address() {
		return buyer_address;
	}
	public void setBuyer_address(String buyer_address) {
		this.buyer_address = buyer_address;
	}
	public String getBuyer_openid() {
		return buyer_openid;
	}
	public void setBuyer_openid(String buyer_openid) {
		this.buyer_openid = buyer_openid;
	}
	public BigDecimal getOrder_amount() {
		return order_amount;
	}
	public void setOrder_amount(BigDecimal order_amount) {
		this.order_amount = order_amount;
	}
	public Boolean getOrder_status() {
		return order_status;
	}
	public void setOrder_status(Boolean order_status) {
		this.order_status = order_status;
	}
	public Boolean getPay_status() {
		return pay_status;
	}
	public void setPay_status(Boolean pay_status) {
		this.pay_status = pay_status;
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
		return "Order_master [order_id=" + order_id + ", buyer_name=" + buyer_name + ", buyer_phone=" + buyer_phone
				+ ", buyer_address=" + buyer_address + ", buyer_openid=" + buyer_openid + ", order_amount="
				+ order_amount + ", order_status=" + order_status + ", pay_status=" + pay_status + ", create_time="
				+ create_time + ", update_time=" + update_time + "]";
	}
	
	
}
