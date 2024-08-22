package com.Evergent.CoreJAVA.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		
		for(int i=0;i<5;i++) {
			arr[i] = i;
		}
		
		for(int j = 0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}

	}

}
