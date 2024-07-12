package com.designpatterns.behavior;

public class BitCoinStrategy implements PaymentStrategy {
	private String walletId;

	public BitCoinStrategy(String walletId) {
		this.walletId = walletId;
	}

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount+" is paid with BitCoin");

	}

}
