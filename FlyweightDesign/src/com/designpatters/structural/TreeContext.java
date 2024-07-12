package com.designpatters.structural;

public class TreeContext {
	private int x;
	private int y;
	private TreeType treeType;

	public TreeContext(int x, int y, TreeType treeType) {
		this.x = x;
		this.y = y;
		this.treeType = treeType;
	}

	public void display() {
		treeType.display(x, y);
	}
}
