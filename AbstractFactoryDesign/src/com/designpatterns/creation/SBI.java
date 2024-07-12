package com.designpatterns.creation;

public class SBI implements Bank{
	private final String Bname;
	public SBI() {
		Bname = "SBI";
	}
	@Override
	public String getBank() {
		return Bname;
	}

}
