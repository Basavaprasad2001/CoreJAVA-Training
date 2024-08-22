package com.Evergent.CoreJAVA.strings;

public class StringBuilderDemo {

	public static void main(String[] args) {

		StringBuilder sbl = new StringBuilder("Hello");
		
		System.out.println("Initial String: "+sbl);
		
		System.out.println(sbl.append(", World"));
		
		System.out.println(sbl.insert(6, " beautiful"));
		
		System.out.println(sbl.replace(7,16,"the"));
		
		System.out.println(sbl.delete(6, 10));
		
		System.out.println(sbl.reverse());
		
		
		
	}

}
