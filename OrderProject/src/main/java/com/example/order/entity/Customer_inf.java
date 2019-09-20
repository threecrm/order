package com.example.order.entity;

import org.springframework.stereotype.Component;

/**
 * 顾客类*/
@Component
public class Customer_inf {
	//**用户编号*/
	private Integer customer_inf_id;
	//**用户名称*/
	private String customer_name;
	//**用户登录密码*/
	private String customer_password;
	//**证件类型：1 身份证，2 军官证，3 护照 默认1*/
	private char identity_card_type;
	//**用户证件号码*/
	private String identity_card_no;
	//**用户手机号*/
	private String mobile_phone;
	//**用户邮箱*/
	private String customer_email;
	//**用户性别*/
	private char gender;
	//**用户积分*/
	private Integer user_point;
	//**用户注册时间*/
	private String register_time;
	//**生日*/
	private String birthday;
	//**用户余额*/
	private Double user_money;
	//**最后修改时间*/
	private String modified_time;
	public Integer getCustomer_inf_id() {
		return customer_inf_id;
	}
	public void setCustomer_inf_id(Integer customer_inf_id) {
		this.customer_inf_id = customer_inf_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_password() {
		return customer_password;
	}
	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
	}
	public char getIdentity_card_type() {
		return identity_card_type;
	}
	public void setIdentity_card_type(char identity_card_type) {
		this.identity_card_type = identity_card_type;
	}
	public String getIdentity_card_no() {
		return identity_card_no;
	}
	public void setIdentity_card_no(String identity_card_no) {
		this.identity_card_no = identity_card_no;
	}
	public String getMobile_phone() {
		return mobile_phone;
	}
	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Integer getUser_point() {
		return user_point;
	}
	public void setUser_point(Integer user_point) {
		this.user_point = user_point;
	}
	public String getRegister_time() {
		return register_time;
	}
	public void setRegister_time(String register_time) {
		this.register_time = register_time;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public Double getUser_money() {
		return user_money;
	}
	public void setUser_money(Double user_money) {
		this.user_money = user_money;
	}
	public String getModified_time() {
		return modified_time;
	}
	public void setModified_time(String modified_time) {
		this.modified_time = modified_time;
	}
	@Override
	public String toString() {
		return "Customer_inf [customer_inf_id=" + customer_inf_id + ", customer_name=" + customer_name
				+ ", customer_password=" + customer_password + ", identity_card_type=" + identity_card_type
				+ ", identity_card_no=" + identity_card_no + ", mobile_phone=" + mobile_phone + ", customer_email="
				+ customer_email + ", gender=" + gender + ", user_point=" + user_point + ", register_time="
				+ register_time + ", birthday=" + birthday + ", user_money=" + user_money + ", modified_time="
				+ modified_time + "]";
	}
}
