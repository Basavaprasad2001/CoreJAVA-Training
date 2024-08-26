package com.Evergent.CoreJAVA.Basava.Application3;


public class AdultUsers implements LibraryUser{
	int age;
	String bookType; 
	public void registerAccount(int age) throws InvalidAgeException{
		if(age>12) {
			System.out.println("You have successfully registered under a Kids Account");
		}
		else {
			throw new InvalidAgeException("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	public void requestBook(String bookType) throws InvalidBookException {
		if(bookType.equals("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else {
			throw new InvalidBookException("Oops, you are allowed to take only kids books” should be displayed in the console");
		}
	}
}
