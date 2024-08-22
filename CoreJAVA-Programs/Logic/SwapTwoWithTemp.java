package com.Evergent.CoreJAVA.Logic;

public class SwapTwoWithTemp {

	public static void main(String[] args) {
		
		int a = 10, b = 20,temp;
		System.out.println("values before swap = "+ a + " and " + b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("values after swap = "+ a + " and " + b);
	}

}
