package com.designpatterns.structural.o2;

public class BankCustomer extends BankDetails implements CreditCard {
	@Override
	public void giveBankDetails() {
		setAccHolderName("Yashwanth");
		setAccNumber(9550413);
		setBankName("State Bank of India");
		
	}
	@Override
	public String getCreditCard() {
		long accno = getAccNumber();
		String holderName = getAccHolderName();
		String bankname = getBankName();
		return ("The Account Number: "+accno+ " account holder: "+holderName+" bank name: "+bankname);
	}
	

}
