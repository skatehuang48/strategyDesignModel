package com.strategy;
/**
 * 抽象策略角色 定义会员折扣力度接口
 * @author Administrator
 *
 */
public interface DiscountStrategy {
	public double vipDiscountPrice(double price);
}
