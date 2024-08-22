package com.Evergent.CoreJAVA.collections;
import java.util.*;
public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		myList.add(100);
		myList.add("Hello");
		myList.add(45.5);
		myList.add(100);
		System.out.println(myList);
		Iterator i = myList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
