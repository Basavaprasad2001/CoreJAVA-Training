package com.Evergent.CoreJAVA.collections;
import java.util.*;
public class HashSetDemo2 {
	public static void main(String[] args) {
		HashSet mySet = new HashSet();
		mySet.add(100);
		mySet.add("Hello");
		mySet.add(45.5);
		mySet.add(100);
		System.out.println(mySet);
		Iterator i = mySet.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
