package com.flowershop.domain;

public class Tree extends Item {

	protected int height;
	
	public Tree(int price, int height) {

		super(price);
		this.height = height;
		super.isATree = true;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	
	
	public boolean isATree() {
		return isATree;
	}

	@Override
	public String toString() {
		return "[id= " + getId() + ", height=" + getHeight() + ", price=" + getPrice() + "]\n";
	}

}
