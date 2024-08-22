package com.Evergent.CoreJAVA.strings;
public class String_Methods {
	public static void main(String[] args) {
		String name = new String("    Hello    ");
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		name = name.trim();
		System.out.println(name.length());
		System.out.println(name.endsWith("d"));
		System.out.println(name.startsWith("a"));
		System.out.println(name.isEmpty());
		System.out.println(name.contains("H"));
		System.out.println(name.indexOf("H"));
		System.out.println(name.lastIndexOf("o"));
		System.out.println("Hello".matches(name));
		System.out.println(name.replace(" ", ""));
		StringBuilder revstr = new StringBuilder(name).reverse();
		System.out.println(revstr.toString());
		System.out.println(name.concat(", World"));
		System.out.println();
		String str1 = "Java is a powerful programming language";
		String[] s = str1.split(" ");
		for(int i = 0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		System.out.println();
		for(String s1 : s) {
			System.out.println(s1);
		}
	}
}
