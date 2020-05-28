package com.strategy;
/**
 * 上下文根，根据传入的算法策略得到最后的执行结果
 * @author Administrator
 *
 */
public class ShoppingContext {
	private DiscountStrategy strategy;
	public ShoppingContext(DiscountStrategy strategy){
		this.strategy = strategy;
	}
	
	public double getDiscountPrice(double price){
		System.out.println("商品原价："+price);
		double disPrice = this.strategy.vipDiscountPrice(price);
		System.out.println("商品折扣后价格："+disPrice);
		return disPrice;
	}
}
