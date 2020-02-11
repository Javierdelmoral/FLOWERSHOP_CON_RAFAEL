package com.flowershop.application;

import com.flowershop.domain.Decoration;
import com.flowershop.domain.DecorationType;
import com.flowershop.domain.Flower;
import com.flowershop.domain.Tree;
import com.flowershop.persistence.ItemRepository;

public class FlowerShopController {
	
	private ItemRepository repository = new ItemRepository();
	private int treeCounter;
	private int flowerCounter;
	private int decorationCounter;

	
	//Empty constructor
	public FlowerShopController() {

	}
	
	//Getters
	
	public int getTreeCounter() {
		return treeCounter;
	}

	public int getFlowerCounter() {
		return flowerCounter;
	}


	public int getDecorationCounter() {
		return decorationCounter;
	}



	//create items methods
	public void createTree(int price, int height) throws Exception{
		
		Tree tree = new Tree (price, height);
		repository.addItem(tree);
		treeCounter++;
		
	}
	
	public void createFlower(int price, String color) throws Exception{
		
		Flower flower = new Flower (price, color);
		repository.addItem(flower);
		flowerCounter++;
	}
	
	public void createDecoration(int price, DecorationType decorationType) throws Exception{
		
		Decoration decoration = new Decoration (price, decorationType);
		repository.addItem(decoration);
		decorationCounter++;
	}
	
	//get repository info method
	public String getAllItems() {
		
		String results="";
		
		//add trees		
		if (getTreeCounter() > 0) {
			results += "TREES:\n";
			for (int i = 0; i < repository.getItems().size(); i++) {
				
				if (repository.getItems().get(i).isATree() == true) {
				
				results += repository.getItems().get(i).toString();
							
				}
			}
		}
	
		//add flowers
		if (getFlowerCounter() > 0) {
			results += "FLOWERS:\n";
			for (int i = 0; i < repository.getItems().size(); i++) {
				
				if (repository.getItems().get(i).isAFlower() == true) {
				
				results += repository.getItems().get(i).toString();
							
				}
			}
		}
	
		//add trees
		if (getDecorationCounter() > 0) {
			results += "DECORATION:\n";
			for (int i = 0; i < repository.getItems().size(); i++) {
				
				if (repository.getItems().get(i).isADecoration() == true) {
				
				results += repository.getItems().get(i).toString();
							
				}
			}
		}
		
		return results;
		
	}

}
