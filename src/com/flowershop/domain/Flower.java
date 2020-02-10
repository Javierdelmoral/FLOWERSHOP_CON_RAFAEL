package com.flowershop.domain;

public class Flower extends Item {

	protected String color;

	public Flower(int price, String color) {

		super(price);
		this.color = color;
		super.isAFlower = true;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	

	@Override
	public String toString() {
		return "[id= " + getId() + ", color=" + getColor() + ", price=" + getPrice() + "]\n";
	}

}
