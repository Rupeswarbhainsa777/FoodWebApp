package com.tap.modeal;

public class History 
{ 
	private int orderHistoryId;
	private int userId;
	private int orderId;
	
	public History() {
		// TODO Auto-generated constructor stub
	}

	public History(int orderHistoryId, int userId, int orderId) {
		super();
		this.orderHistoryId = orderHistoryId;
		this.userId = userId;
		this.orderId = orderId;
	}

	public int getOrderHistoryId() {
		return orderHistoryId;
	}

	public void setOrderHistoryId(int orderHistoryId) {
		this.orderHistoryId = orderHistoryId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	

}
