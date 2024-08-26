package com.Evergent.CoreJAVA.Basava.Application3;



public class LibraryInterfaceDemo{
	public static void main(String args[]){
		KidUsers ku = new KidUsers();
		AdultUsers au = new AdultUsers();
		try {
			ku.registerAccount(10);
			ku.registerAccount(18);
			au.registerAccount(5);
			au.registerAccount(23);
			ku.requestBook("Kids");
			ku.requestBook("Fiction");
			au.requestBook("Kids");
			au.requestBook("Fiction");
		}catch(InvalidAgeException e) {
			System.out.println(e);
		}
		catch(InvalidBookException e) {
			System.out.println(e);
		}
		
		
		
		
	}
}








