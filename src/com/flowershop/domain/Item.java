package com.flowershop.domain;

public abstract class Item {
	
	protected int id;
	protected int price;
	
	private static int COUNTER = 1;
	

	public Item(int price) {
		
		this.price = price;
		this.id = COUNTER;
		COUNTER++;
		
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	

}
