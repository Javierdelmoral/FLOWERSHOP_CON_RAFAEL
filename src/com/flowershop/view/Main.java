package com.flowershop.view;

import com.flowershop.application.FlowerShopController;
import com.flowershop.domain.DecorationType;

public class Main {
	
	private static final DecorationType WOOD = DecorationType.WOOD;
	private static final DecorationType PLASTIC = DecorationType.PLASTIC;
	private static FlowerShopController controller = new FlowerShopController();

	public static void main(String[] args) throws Exception {
		
		controller.createDecoration(12, WOOD);
		controller.createDecoration(10, PLASTIC);
		controller.createFlower(5, "azul");
		controller.createTree(4, 50);
		
		String allItems = controller.getAllItems();
		
		System.out.println(allItems);
		
		

	}

}
