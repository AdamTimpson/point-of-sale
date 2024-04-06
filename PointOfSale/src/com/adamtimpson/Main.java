package com.adamtimpson;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		new GUI("Point Of Sale", 1920, 1080).init();
		Item itemBleach = new Item("Bleach", "Used for cleaning", 1.99, Category.HOUSEHOLD);
		Item itemCup = new Item("Cup", "It's a cup...", 1.99, Category.HOUSEHOLD);
		Item itemSoap = new Item("Soap", "Wash your hands!", 2.49, Category.HOUSEHOLD);
		Item itemScreenWash = new Item("Screen Wash", "Windscreen washer fluid", 9.59, Category.AUTO);
		Item itemApple = new Item("Apple", "Omnomnom", 0.84, Category.FOOD);
		Item itemShirt = new Item("T-Shirt", "A t-shirt", 5.0, Category.FASHION);
		
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(itemBleach);
		items.add(itemCup);
		items.add(itemSoap);
		items.add(itemScreenWash);
		items.add(itemApple);
		items.add(itemShirt);
		
		for(Item item: items) {
			System.out.println(item);
		}
		
	}
	
}
