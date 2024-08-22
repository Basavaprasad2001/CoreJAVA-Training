package com.Evergent.CoreJAVA.Exception;
// o)Throw is for run time exceptions & will call predefined exceptions & user defined exception
class ProductNotFoundException extends Exception{
	public ProductNotFoundException(String msg) {
		System.out.println("Hello: "+msg);
	}
}
public class ExceptionDemo9 {
	int pno = 105;
	public void myData() throws Exception{
		if(pno>100) {
			throw new ProductNotFoundException("Product is not there");
		}
		else {
			System.out.println("product is there");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo9 ed9 = new ExceptionDemo9();
		try {
			ed9.myData();
		}
		catch(Exception e) {
			System.out.println("I can handle: "+e);
		}
	}
}
