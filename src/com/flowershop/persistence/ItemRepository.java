package com.flowershop.persistence;

import java.util.ArrayList;
import java.util.List;

import com.flowershop.domain.Item;

public class ItemRepository {
	
	//list of items
	private static List<Item> items = new ArrayList<>();
	
	//repository constructor
	public ItemRepository() {
		
	}

	//getter
	public static List<Item> getItems() {
		
		return new ArrayList<>(items);
		
	}
	
	//add method
	public void addItem(Item item) throws Exception{
		
		if(item == null) throw new Exception();
		items.add(item);
		
	}
	

}
