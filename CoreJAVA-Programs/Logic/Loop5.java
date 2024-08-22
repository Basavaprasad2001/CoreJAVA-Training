package com.Evergent.CoreJAVA.Logic;

public class Loop5 {

	public static void main(String[] args) {
		
		int n = 25;
		for(int i = 1;i<=5;i++) {
			for(int j = 1;j<=5;j++) {
				System.out.print(n+" ");
				n--;
			}
			System.out.println();
		}

	}

}
