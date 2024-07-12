package com.designpatterns.creation;

public class ICICI implements Bank{
	private final String Bname;
	public ICICI() {
		Bname = "ICICI";
		
	}
	@Override
	public String getBank() {
		return Bname;
	}

}
