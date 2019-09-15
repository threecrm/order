package com.example.order.entity;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Fenye {
	private Integer page;
	private Integer pageSize;
	private Integer total;
	private List<Product_info> rows;
	
	private Product_info product_info;
	
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
	public List<Product_info> getRows() {
		return rows;
	}
	public void setRows(List<Product_info> rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "Fenye [page=" + page + ", pageSize=" + pageSize + ", total=" + total + ", rows=" + rows
				+ ", product_info=" + product_info + "]";
	}
	

}
