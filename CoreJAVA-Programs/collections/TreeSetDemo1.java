package com.Evergent.CoreJAVA.collections;
import java.util.*;
public class TreeSetDemo1 {
	public static void main(String[] args) {
		TreeSet myTreeSet = new TreeSet();
		myTreeSet.add(100);
		myTreeSet.add(10);
		myTreeSet.add(40);
		myTreeSet.add(50);
		System.out.println(myTreeSet);
		Iterator i = myTreeSet.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
