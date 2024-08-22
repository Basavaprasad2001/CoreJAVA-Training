package com.Evergent.CoreJAVA.strings;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sbr = new StringBuffer("Hello");
		
		System.out.println("Initial String: "+sbr);
		
		System.out.println(sbr.append(", World"));
		
		System.out.println(sbr.insert(6, " beautiful"));
		
		System.out.println(sbr.replace(7,16,"the"));
		
		System.out.println(sbr.delete(6, 10));
		
		System.out.println(sbr.reverse());
		
		System.out.println(sbr);
		
		System.out.println(sbr.capacity());
		
		System.out.println(sbr.length());
		
		
		
	}

}
