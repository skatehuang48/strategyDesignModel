package com.strategy;

public class Client {
	public static void main(String[] args) {
		DiscountStrategy strategy = new Vip1DiscountStragety();
		ShoppingContext context = new ShoppingContext(strategy);
		context.getDiscountPrice(1000);
		System.out.println("---------------------");
		DiscountStrategy strategy2 = new Vip2DiscountStrategy();
		ShoppingContext context2 = new ShoppingContext(strategy2);
		context2.getDiscountPrice(600);
	}
}
