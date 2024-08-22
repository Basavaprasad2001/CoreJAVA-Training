package com.Evergent.CoreJAVA.JavaBeans;

public class ProductImpl {

	public static void main(String[] args) {
		ProductBeans pro = new ProductBeans(100, "laptop", 55000);
		
		System.out.println("pno: "+pro.getPno());
		System.out.println("pname: "+pro.getPname());
		System.out.println("price: "+pro.getPrice());
	}
}
