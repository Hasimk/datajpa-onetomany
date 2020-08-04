package com.mypack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDERS")
public class Order {
	
	@Id
	private Integer orderId;
	
	@Column(length=25)
	private String itemName;
	
	private Double price;
	
	public Order() {
		
	}

	
	public Order(Integer orderId, String itemName, Double price) {
		super();
		this.orderId = orderId;
		this.itemName = itemName;
		this.price = price;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", itemName=" + itemName + ", price=" + price + "]";
	}
	
	

}
