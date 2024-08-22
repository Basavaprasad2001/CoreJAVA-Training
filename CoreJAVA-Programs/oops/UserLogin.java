package com.Evergent.CoreJAVA.oops;

public class UserLogin {
	public void loginDetails() {
		System.out.println("login details");
	}
	public void loginDetails(String username, String pass) {
		System.out.println(username);
		System.out.println(pass);
	}
	public void loginDetails(String uname, String pass, String captcha) {
		System.out.println(uname);
		System.out.println(pass);
		System.out.println(captcha);
	}
	public void loginDetails(int mobile, String pass) {
		System.out.println(mobile);
		System.out.println(pass);
	}
	public void show() {
		System.out.println("Method");
	}
	public static void main(String[] args) {
		UserLogin u = new UserLogin();
		u.loginDetails();
		u.loginDetails("basava","pass");
		u.loginDetails("basava","pass","@1");
		u.loginDetails(1234,"pass");
		u.show();
	}
}
