package com.adamtimpson;

public class Item {

	private String title; 
	private String description; 
	
	private Category category;
	
	private double cost; 
	
	public Item() {
		
	}
	
	public Item(String title, String description, double cost, Category category) {
		this.title = title;
		this.description = description;
		
		this.cost = cost;
		
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "[" + this.category + "]" + this.title + " @ €" + this.cost + " - " + this.description;
	}
	
}
