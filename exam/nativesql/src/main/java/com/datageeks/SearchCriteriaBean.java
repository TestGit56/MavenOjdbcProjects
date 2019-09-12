package com.datageeks;

import java.io.Serializable;

public class SearchCriteriaBean implements Serializable{

	private Integer productId = null;
	private String productName = null;
	public SearchCriteriaBean() {
		super();
	}
	public SearchCriteriaBean(Integer productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "SearchCriteriaBean [productId=" + productId + ", productName=" + productName + "]";
	}
	
	
}
