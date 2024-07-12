package com.designpatterns.creation;

public class GeneralBill {
	public static void main(String args[]) {
		GetPlanFactory factory = new GetPlanFactory();
		Plan plan = factory.getPlan("Commercialplan");
		System.out.println("Commercial plan \nRate: "+plan.getRate());
		System.out.println("bill: "+plan.calculateBill(3));
		;
		
	}
	
	// for demo we hard coded plan string here but in real time we take user input.

	
	
}
