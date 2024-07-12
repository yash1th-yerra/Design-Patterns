package com.designpatterns.structural;

public class File implements FileSystemComponent {  //leaf file
	private String name;
	public File(String name) {
		this.name = name;
	}

	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println("File: "+name);

	}

}
