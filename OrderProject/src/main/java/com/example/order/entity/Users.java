package com.example.order.entity;

import org.springframework.stereotype.Component;

/**用户*/
@Component
public class Users {
	/**用户编号*/
	private Integer userid;
	/**用户名称*/
	private String userName;
	/**用户登录账号*/
	private String user_loginName;
	/**用户登录密码*/
	private String user_PassWord;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUser_loginName() {
		return user_loginName;
	}
	public void setUser_loginName(String user_loginName) {
		this.user_loginName = user_loginName;
	}
	public String getUser_PassWord() {
		return user_PassWord;
	}
	public void setUser_PassWord(String user_PassWord) {
		this.user_PassWord = user_PassWord;
	}
	@Override
	public String toString() {
		return "Users [userid=" + userid + ", userName=" + userName + ", user_loginName=" + user_loginName
				+ ", user_PassWord=" + user_PassWord + "]";
	}
	
	
	
}
