package com.designpatterns.structural;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
	private String name;
	List<FileSystemComponent> components = new ArrayList<>();
	public Directory(String name) {
		this.name = name;
	}
	public void addComponent(FileSystemComponent component) {
		components.add(component);
	}
	public void removeComponent(FileSystemComponent component) {
		components.add(component);
	}

	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println("Directory: "+name);
		for(FileSystemComponent c : components) {
			c.printName();
		}

	}

}
