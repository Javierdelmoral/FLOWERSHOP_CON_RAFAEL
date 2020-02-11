package com.flowershop.domain;

public class Decoration extends Item {

	DecorationType decorationType;

	public Decoration(int price, DecorationType decorationType) {

		super(price);

		switch (decorationType.toString()) {
		case "WOOD":

			this.decorationType = DecorationType.WOOD;

			break;

		case "PLASTIC":

			this.decorationType = DecorationType.PLASTIC;

			break;
		}
		super.isADecoration = true;
	}

	/**
	 * @return the decorationType
	 */
	public DecorationType getDecorationType() {
		return decorationType;
	}

	/**
	 * @param decorationType the decorationType to set
	 */
	public void setDecorationType(DecorationType decorationType) {
		this.decorationType = decorationType;
	}

	

	@Override
	public String toString() {
		return "[id= " + id + ", decorationType=" + decorationType + ", price=" + price + "]\n";
	}
	
	

}
