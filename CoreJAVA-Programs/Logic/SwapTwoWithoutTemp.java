package com.Evergent.CoreJAVA.Logic;

public class SwapTwoWithoutTemp {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		System.out.println("values before swap = "+ a + " and " + b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("values after swap = "+ a + " and " + b);
	}

}
