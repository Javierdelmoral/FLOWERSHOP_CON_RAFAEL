package com.flowershop.application;

import com.flowershop.domain.Decoration;
import com.flowershop.domain.Flower;
import com.flowershop.domain.Tree;
import com.flowershop.persistence.ItemRepository;

public class FlowerShopController {
	
	private String Name;
	private ItemRepository repository = new ItemRepository();
	
	//Empty constructor
	public FlowerShopController() {

	}
	
	//create items methods
	public void createTree(int price, int height) throws Exception{
		
		Tree tree = new Tree (price, height);
		repository.addItem(tree);
		
	}
	
	public void createFlower(int price, String color) throws Exception{
		
		Flower flower = new Flower (price, color);
		repository.addItem(flower);
		
	}
	
	public void createDecoration(int price, String decorationType) throws Exception{
		
		Decoration decoration = new Decoration (price, decorationType);
		repository.addItem(decoration);
		
	}
	
	//get repository info method
	public String getAllItems() {
		
		String results="";
		
		for (int i = 0; i < repository.getItems().size(); i++) {
			
			results += repository.getItems().get(i).toString();
						
		}
		
		return results;
		
	}

}
