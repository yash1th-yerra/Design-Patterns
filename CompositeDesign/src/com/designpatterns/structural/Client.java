package com.designpatterns.structural;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemComponent file1 = new File("file1.txt");
        FileSystemComponent file2 = new File("file2.txt");
        FileSystemComponent file3 = new File("file3.txt");

        // Create directories
        Directory dir1 = new Directory("Folder 1");
        Directory dir2 = new Directory("Folder 2");

        // Add files to directories
        dir1.addComponent(file1);
        dir1.addComponent(file2);
        dir2.addComponent(file3);

        // Create a composite directory
        Directory rootDirectory = new Directory("Root");
        rootDirectory.addComponent(dir1);
        rootDirectory.addComponent(dir2);

        // Print all components in the file system
        rootDirectory.printName();

	}

}
