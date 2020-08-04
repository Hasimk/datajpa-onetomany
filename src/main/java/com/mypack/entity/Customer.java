package com.mypack.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer {

	@Id
	
	private Integer customerId;
	
	@Column(length=20)
	private String customerName;
	
	private Long mobile;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="customerid_fk", referencedColumnName="customerId")
	private Set<Order> orders;
	
	public Customer() {
		
		
	}
	
		public Customer(Integer customerId, String customerName, Long mobile) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobile = mobile;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", mobile=" + mobile
				+ ", orders=" + orders + "]";
	}
	
	
	
}
