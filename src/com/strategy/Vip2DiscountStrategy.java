package com.strategy;
/**
 * 具体策略模式 vip2折扣算法
 * @author Administrator
 *
 */
public class Vip2DiscountStrategy implements DiscountStrategy {

	@Override
	public double vipDiscountPrice(double price) {
		System.out.println("vip2 算法策略 打八折");
		return price * 0.8;
	}

}
