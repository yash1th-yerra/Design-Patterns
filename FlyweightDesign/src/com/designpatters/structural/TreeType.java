package com.designpatters.structural;

public class TreeType implements Tree {   //intrisic state
	private String name;
	private String color;
	private String texture;
	
	public TreeType(String name,String color,String texture) {
		this.name = name;
		this.color = color;
		this.texture = texture;
		
	}

	@Override
	public void display(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Displaying "+name+" tree at ("+x+") and ("+y+") with color "+color+"  and texture "+texture);
		

	}

}
