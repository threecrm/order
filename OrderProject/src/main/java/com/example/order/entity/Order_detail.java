package com.example.order.entity;

public class Order_detail {
	private String detail_id;
	private String order_id;
	private String product_id;
	/**商品名称*/
	private String product_name;
	/**商品价格*/
	private String product_price;
	/**商品数量*/
	private Integer product_quantity;
	/**商品小图*/
	private String product_icon;
	/**创建时间*/
	private String create_time;
	/**修改时间*/
	private String update_time;
	public String getDetail_id() {
		return detail_id;
	}
	public void setDetail_id(String detail_id) {
		this.detail_id = detail_id;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
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
	public String getProduct_price() {
		return product_price;
	}
	public void setProduct_price(String product_price) {
		this.product_price = product_price;
	}
	public Integer getProduct_quantity() {
		return product_quantity;
	}
	public void setProduct_quantity(Integer product_quantity) {
		this.product_quantity = product_quantity;
	}
	public String getProduct_icon() {
		return product_icon;
	}
	public void setProduct_icon(String product_icon) {
		this.product_icon = product_icon;
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
		return "Order_detail [detail_id=" + detail_id + ", order_id=" + order_id + ", product_id=" + product_id
				+ ", product_name=" + product_name + ", product_price=" + product_price + ", product_quantity="
				+ product_quantity + ", product_icon=" + product_icon + ", create_time=" + create_time
				+ ", update_time=" + update_time + "]";
	}
	
	
}
