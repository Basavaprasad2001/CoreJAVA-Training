package com.Evergent.CoreJAVA.Logic;

public class BigFive {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30, d = 40, e = 50;
		if(a>b && a>c && a>c && a>d) {
			System.out.println("a is big");
		}
		if(b>a && b>c && b>d && b>e) {
			System.out.println("b is big");
		}
		if(c>a && c>b && c>d && c>e) {
			System.out.println("c is big");
		}
		if(d>a && d>b && d>c && d>e) {
			System.out.println("d is big");
		}
		else {
			System.out.println("e is big");
		}

	}

}
