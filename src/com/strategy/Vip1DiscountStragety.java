package com.strategy;
/**
 * ������Խ�ɫ vip1�ۿ��㷨
 * @author Administrator
 *
 */
public class Vip1DiscountStragety implements DiscountStrategy {

	@Override
	public double vipDiscountPrice(double price) {
		// TODO Auto-generated method stub
		System.out.println("vip1 �㷨���� �����");
		return price * 0.9;
	}

}
