package com.Evergent.CoreJAVA.abstract1;

public class ProductImpl2 extends Product2 {
	
	public ProductImpl2() {
		System.out.println("ProductImpl2 constructor");
	}

	public void newProduct() {
		System.out.println("Abstract Method");
	}
	
	public void show() {
		System.out.println("Local Method");
	}
	public static void main(String[] args) {

		ProductImpl2 p1 = new ProductImpl2();
		p1.show();
		p1.newProduct();
		p1.allProduct();
	}
}
