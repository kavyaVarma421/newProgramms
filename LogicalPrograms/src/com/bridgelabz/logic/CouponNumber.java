package com.bridgelabz.logic;

public class CouponNumber 
{

	public static void main(String[] args) {
		
		char[] ch = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int max = 100000000;
		int random = (int)(Math.random() *max);
		StringBuffer sb = new StringBuffer();
		
		while(random > 0)
		{
			sb.append(ch[random % ch.length]);
			random = random/ch.length;
		}
		String coupon = sb.toString();
		System.out.println("couponNumber is " +coupon);
		
	}


}