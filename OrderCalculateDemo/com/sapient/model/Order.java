package com.sapient.model;

import java.util.List;

public class Order {

	private long orderId;

	private long totalPrice;

	private long totalDiscount;

	private long userId;

	private char status; // P - pending , M - payment authorized , D -
							// Dispatched , X- Canceled

	private List<OrderItem> orderItems;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}

	public long getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(long totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	
	
	
	
}
