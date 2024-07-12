package com.designpatterns.structural;

public class RealInternetAccess implements OfficeInternetAccess{
	private String employeeName;
	public RealInternetAccess(String empName) {
		this.employeeName = empName;
	}
	@Override
	public void grantInternetAccess() {
		// TODO Auto-generated method stub
		System.out.println("Internet Access granted for Employee "+employeeName);
		
	}
	
}
