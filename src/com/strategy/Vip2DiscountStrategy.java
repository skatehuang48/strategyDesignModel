package com.strategy;
/**
 * �������ģʽ vip2�ۿ��㷨
 * @author Administrator
 *
 */
public class Vip2DiscountStrategy implements DiscountStrategy {

	@Override
	public double vipDiscountPrice(double price) {
		System.out.println("vip2 �㷨���� �����");
		return price * 0.8;
	}

}
