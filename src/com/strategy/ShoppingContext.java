package com.strategy;
/**
 * �����ĸ������ݴ�����㷨���Եõ�����ִ�н��
 * @author Administrator
 *
 */
public class ShoppingContext {
	private DiscountStrategy strategy;
	public ShoppingContext(DiscountStrategy strategy){
		this.strategy = strategy;
	}
	
	public double getDiscountPrice(double price){
		System.out.println("��Ʒԭ�ۣ�"+price);
		double disPrice = this.strategy.vipDiscountPrice(price);
		System.out.println("��Ʒ�ۿۺ�۸�"+disPrice);
		return disPrice;
	}
}
