package com.designpatterns.structural.o2;

public class AdapterPatternDemo2 {
	public static void main(String[] args) {
		CreditCard cc = new BankCustomer();
		cc.giveBankDetails();
		System.out.println(cc.getCreditCard());
	}

}
