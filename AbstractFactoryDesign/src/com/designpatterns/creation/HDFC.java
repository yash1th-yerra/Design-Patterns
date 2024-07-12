package com.designpatterns.creation;

public class HDFC implements Bank{
	private final String Bname;
	public HDFC() {
		Bname = "HDFC";
	}
	@Override
	public String getBank() {
		return Bname;
	}

}
