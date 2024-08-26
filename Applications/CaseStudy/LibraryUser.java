package com.Evergent.CoreJAVA.Basava.Application3;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg){
		super(msg);
	}
}

class InvalidBookException extends Exception{
	public InvalidBookException(String message) {
		super(message);
	}
}

public interface LibraryUser {
	public void registerAccount(int age) throws InvalidAgeException;
	public void requestBook(String bookType) throws InvalidBookException;
}