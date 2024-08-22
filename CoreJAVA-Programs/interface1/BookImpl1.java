package com.Evergent.CoreJAVA.interface1;

public class BookImpl1 implements Book {
	public void bookTitle() {
		System.out.println("Core JAVA"+cname);
	}
	public void bookAuthor() {
		System.out.println("oracle corp");
	}
	public void bookPrice() {
		System.out.println("Rs. 550");
	}
	public void show() {
		System.out.println("I am show method");
	}
	public static void main(String[] args) {
		BookImpl1 b1 = new BookImpl1();
		b1.bookTitle();
		b1.bookAuthor();
		b1.bookPrice();
		b1.show();
	}
}
