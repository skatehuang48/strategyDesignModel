package com.strategy;
/**
 * 具体策略角色 vip1折扣算法
 * @author Administrator
 *
 */
public class Vip1DiscountStragety implements DiscountStrategy {

	@Override
	public double vipDiscountPrice(double price) {
		// TODO Auto-generated method stub
		System.out.println("vip1 算法策略 打九折");
		return price * 0.9;
	}

}
