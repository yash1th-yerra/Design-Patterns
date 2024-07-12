package com.designpatterns.creation;

public class Shop {
	public static void main(String[] args) {
		
		PhoneBuilder builder = new PhoneBuilder();
		builder.setOs("Android");
		builder.setProcessor("SnapDragon");
		builder.setRam(8);
		builder.setScreenSize(12);
		builder.setBattery(4500);
		Phone p =builder.getPhone();
		System.out.println(p);
	}

}
