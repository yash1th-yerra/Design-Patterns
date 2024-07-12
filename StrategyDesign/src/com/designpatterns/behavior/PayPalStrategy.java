package com.designpatterns.behavior;

public class PayPalStrategy implements PaymentStrategy {
	private String emailId;
	private String password;
	

	public PayPalStrategy(String emailId, String password) {
		this.emailId = emailId;
		this.password = password;
	}


	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount+" is paid with PayPal");

	}

}
