package com.designpatterns.behavior;

public class StrategyPatternDemo {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		Item item1 = new Item("Item1", 100);
		Item item2 = new Item("Item2", 200);

		cart.addItem(item1);
		cart.addItem(item2);

		// Pay using Credit Card
		cart.setPaymentStrategy(new CreditCardStrategy("John Doe", "1234567890123456", "786", "12/23"));
		cart.checkout();

		// Pay using PayPal
		cart.setPaymentStrategy(new PayPalStrategy("john@example.com", "mypassword"));
		cart.checkout();

		// Pay using Bitcoin
		cart.setPaymentStrategy(new BitCoinStrategy("mywalletid"));
		cart.checkout();
	}
}