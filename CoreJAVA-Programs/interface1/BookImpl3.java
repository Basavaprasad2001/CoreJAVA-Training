package com.Evergent.CoreJAVA.interface1;

public class BookImpl3 implements Book, NewBook{
	public void bookTitle() {
		System.out.println("Core JAVA: "+cname);
	}
	public void bookAuthor() {
		System.out.println("oracle corp");
	}
	public void bookPrice() {
		System.out.println("Rs. 550");
	}
	public void addNewBook() {
		System.out.println("New Book");
	}
	public void myData() {
		System.out.println("My Data Info");
	}
	public void show() {
		System.out.println("I am show method");
	}
	public static void main(String[] args) {
		BookImpl3 b1 = new BookImpl3();
		b1.bookTitle();
		b1.bookAuthor();
		b1.bookPrice();
		b1.addNewBook();
		b1.myData();
		b1.show();
	}
}
