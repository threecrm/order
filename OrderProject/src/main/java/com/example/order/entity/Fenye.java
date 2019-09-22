package com.example.order.entity;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Fenye<T> {
	private Integer page;
	private Integer pageSize;
	private Integer total;
	private List<T> rows;
	
	private Product_info product_info;
	private Product_category product_category;
	
	public Product_category getProduct_category() {
		return product_category;
	}
	public void setProduct_category(Product_category product_category) {
		this.product_category = product_category;
	}
	public Product_info getProduct_info() {
		return product_info;
	}
	public void setProduct_info(Product_info product_info) {
		this.product_info = product_info;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "Fenye [page=" + page + ", pageSize=" + pageSize + ", total=" + total + ", rows=" + rows
				+ ", product_info=" + product_info + ", product_category=" + product_category + "]";
	}
	

}
