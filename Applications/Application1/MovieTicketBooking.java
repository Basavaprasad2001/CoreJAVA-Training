package com.Evergent.CoreJAVA.Basava.Application1;

import java.util.*;

public class MovieTicketBooking {

	enum module {
		B, C, I, E
	}

	static int n, n1, n2, n3, n4,n5;
	static String area, theatre, movie;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("------------------------Book your movie ticket!!------------------------\n\n");
			System.out.println("Select the Area: ");
			System.out.println("1. B for Book a ticket");
			System.out.println("2. C for Cancel a ticket");
			System.out.println("3. E for Exit");
			System.out.println("3. I for Invoice");
			System.out.print("Select your option: ");
			String s1 = sc.next();
			System.out.print("\n");
			System.out.print("==================================");
			System.out.print("\n\n");
			switch (module.valueOf(s1.toUpperCase())) {
			case B:
				System.out.println("Select Area: ");
				System.out.println("1. KPHB");
				System.out.println("2. Miyapur");
				System.out.println("3. Madhapur");
				System.out.print("Select your option: ");
				n = sc.nextInt();
				System.out.print("\n");
				System.out.print("==================================");
				System.out.print("\n\n");
				switch (n) {
				case 1:
					area = "KPHB";
					System.out.println("Select Theatre: ");
					System.out.println("1. Vishwanath");
					System.out.println("2. Arjun");
					System.out.print("Select your option: ");
					n1 = sc.nextInt();
					System.out.print("\n");
					System.out.print("==================================");
					System.out.print("\n\n");
					switch (n1) {
					case 1:
						theatre = "Vishwanath";
						System.out.println("Select Movie: ");
						System.out.println("1. Kalki");
						System.out.println("2. Maharaja");
						System.out.print("Select your option: ");
						n2 = sc.nextInt();
						System.out.print("\n");
						System.out.print("==================================");
						System.out.print("\n\n");
						switch (n2) {
						case 1:
							movie = "Kalki";
							System.out.print("Enter number of viewers: ");
							n3 = sc.nextInt();
							System.out.println("Choose your seat: ");
							System.out.println("1. Balcony");
							System.out.println("2. Gold");
							System.out.println("3. silver");
							System.out.println("Select your option: ");
							n5 = sc.nextInt();
							switch(n5) {
								case 1:
									n4 = n3 * 200;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 2:
									n4 = n3 * 150;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 3:
									n4 = n3 * 100;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
							}
							System.out.print("\n");
							System.out.print("\n\n");

							break;

						case 2:
							movie = "Maharaja";
							System.out.print("Enter number of viewers: ");
							n3 = sc.nextInt();
							System.out.println("Choose your seat: ");
							System.out.println("1. Balcony");
							System.out.println("2. Gold");
							System.out.println("3. silver");
							System.out.println("Select your option: ");
							n5 = sc.nextInt();
							switch(n5) {
								case 1:
									n4 = n3 * 200;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 2:
									n4 = n3 * 150;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 3:
									n4 = n3 * 100;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
									
							}
							System.out.print("\n");
							System.out.print("\n\n");
							break;

						}
						break;
					case 2:
						theatre = "Arjun";
						System.out.println("Select Movie: ");
						System.out.println("1. Kalki");
						System.out.println("2. Maharaja");
						System.out.print("Select your option: ");
						n = sc.nextInt();
						System.out.print("\n");
						System.out.print("==================================");
						System.out.print("\n\n");
						switch (n) {
						case 1:
							movie = "Kalki";
							System.out.print("Enter number of viewers: ");
							n3 = sc.nextInt();
							System.out.println("Choose your seat: ");
							System.out.println("1. Balcony");
							System.out.println("2. Gold");
							System.out.println("3. silver");
							System.out.println("Select your option: ");
							n5 = sc.nextInt();
							switch(n5) {
								case 1:
									n4 = n3 * 200;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 2:
									n4 = n3 * 150;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 3:
									n4 = n3 * 100;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
									
							}
							System.out.print("\n");
							System.out.print("\n\n");
							break;

						case 2:
							movie = "Maharaja";
							System.out.print("Enter number of viewers: ");
							n3 = sc.nextInt();
							System.out.println("Choose your seat: ");
							System.out.println("1. Balcony");
							System.out.println("2. Gold");
							System.out.println("3. silver");
							System.out.println("Select your option: ");
							n5 = sc.nextInt();
							switch(n5) {
								case 1:
									n4 = n3 * 200;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 2:
									n4 = n3 * 150;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 3:
									n4 = n3 * 100;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
									
							}
							System.out.print("\n");
							System.out.print("\n\n");
							break;
						}
						break;
						
					
						
					}
					break;

				case 2:
					area = "Miyapur";
					System.out.println("Select Theatre: ");
					System.out.println("1. Miraj Cinemas");
					System.out.println("2. Sai Ranga");
					System.out.print("Select your option: ");
					n = sc.nextInt();
					System.out.print("\n");
					System.out.print("==================================");
					System.out.print("\n\n");
					switch (n) {
					case 1:
						theatre = "Miraj Cinemas";
						System.out.println("Select Movie: ");
						System.out.println("1. Kalki");
						System.out.println("2. Maharaja");
						System.out.print("select your option: ");
						n = sc.nextInt();
						System.out.print("\n");
						System.out.print("==================================");
						System.out.print("\n\n");
						switch (n) {
						case 1:
							movie = "Kalki";
							System.out.print("Enter number of viewers: ");
							n3 = sc.nextInt();
							System.out.println("Choose your seat: ");
							System.out.println("1. Balcony");
							System.out.println("2. Gold");
							System.out.println("3. silver");
							System.out.println("Select your option: ");
							n5 = sc.nextInt();
							switch(n5) {
								case 1:
									n4 = n3 * 200;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 2:
									n4 = n3 * 150;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 3:
									n4 = n3 * 100;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
									
							}
							System.out.print("\n");
							System.out.print("\n\n");
							break;

						case 2:
							movie = "Maharaja";
							System.out.print("enter number of viewers: ");
							n3 = sc.nextInt();
							System.out.println("Choose your seat: ");
							System.out.println("1. Balcony");
							System.out.println("2. Gold");
							System.out.println("3. silver");
							System.out.println("Select your option: ");
							n5 = sc.nextInt();
							switch(n5) {
								case 1:
									n4 = n3 * 200;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 2:
									n4 = n3 * 150;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 3:
									n4 = n3 * 100;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
									
							}
							System.out.print("\n");
							System.out.print("\n\n");
							break;
						}
					case 2:
						theatre = "Sai Ranga";
						System.out.println("select Movie: ");
						System.out.println("1. Kalki");
						System.out.println("2. Maharaja");
						System.out.print("select your option: ");
						n = sc.nextInt();
						System.out.print("\n");
						System.out.print("==================================");
						System.out.print("\n\n");
						switch (n) {
						case 1:
							movie = "Kalki";
							System.out.print("enter number of viewers: ");
							n3 = sc.nextInt();
							System.out.println("Choose your seat: ");
							System.out.println("1. Balcony");
							System.out.println("2. Gold");
							System.out.println("3. silver");
							System.out.println("Select your option: ");
							n5 = sc.nextInt();
							switch(n5) {
								case 1:
									n4 = n3 * 200;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 2:
									n4 = n3 * 150;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 3:
									n4 = n3 * 100;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
									
							}
							System.out.print("\n");
							break;

						case 2:
							movie = "Maharaja";
							System.out.print("enter number of viewers: ");
							n3 = sc.nextInt();
							System.out.println("Choose your seat: ");
							System.out.println("1. Balcony");
							System.out.println("2. Gold");
							System.out.println("3. silver");
							System.out.println("Select your option: ");
							n5 = sc.nextInt();
							switch(n5) {
								case 1:
									n4 = n3 * 200;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 2:
									n4 = n3 * 150;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 3:
									n4 = n3 * 100;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
									
							}
							System.out.print("\n");
							break;
						}
					}
					break;
				case 3:
					area = "Madhapur";
					System.out.println("Select Theatre: ");
					System.out.println("1. PVR");
					System.out.println("2. BR hitech");
					System.out.print("select your option: ");
					n = sc.nextInt();
					System.out.print("\n");
					System.out.print("==================================");
					System.out.print("\n\n");
					switch (n) {
					case 1:
						theatre = "PVR";
						System.out.println("select Movie: ");
						System.out.println("1. Kalki");
						System.out.println("2. Maharaja");
						System.out.print("select your option: ");
						n = sc.nextInt();
						System.out.print("\n");
						System.out.print("==================================");
						System.out.print("\n\n");
						switch (n) {
						case 1:
							movie = "Kalki";
							System.out.print("enter number of viewers: ");
							n3 = sc.nextInt();
							System.out.println("Choose your seat: ");
							System.out.println("1. Balcony");
							System.out.println("2. Gold");
							System.out.println("3. silver");
							System.out.println("Select your option: ");
							n5 = sc.nextInt();
							switch(n5) {
								case 1:
									n4 = n3 * 200;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 2:
									n4 = n3 * 150;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 3:
									n4 = n3 * 100;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
									
							}
							System.out.print("\n");
							System.out.print("\n\n");
							break;

						case 2:
							movie = "Maharaja";
							System.out.print("enter number of viewers: ");
							n3 = sc.nextInt();
							System.out.println("Choose your seat: ");
							System.out.println("1. Balcony");
							System.out.println("2. Gold");
							System.out.println("3. silver");
							System.out.println("Select your option: ");
							n5 = sc.nextInt();
							switch(n5) {
								case 1:
									n4 = n3 * 200;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 2:
									n4 = n3 * 150;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 3:
									n4 = n3 * 100;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
									
							}
							System.out.print("\n");
							System.out.print("\n\n");
							break;
						}
						break;
					case 2:
						theatre = "BR hitech";
						System.out.println("select Movie: ");
						System.out.println("1. Kalki");
						System.out.println("2. Maharaja");
						System.out.print("select your option: ");
						n = sc.nextInt();
						System.out.print("\n");
						System.out.print("==================================");
						System.out.print("\n\n");
						switch (n) {
						case 1:
							movie = "kalki";
							System.out.print("enter number of viewers: ");
							n3 = sc.nextInt();
							System.out.println("Choose your seat: ");
							System.out.println("1. Balcony");
							System.out.println("2. Gold");
							System.out.println("3. silver");
							System.out.println("Select your option: ");
							n5 = sc.nextInt();
							switch(n5) {
								case 1:
									n4 = n3 * 200;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 2:
									n4 = n3 * 150;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 3:
									n4 = n3 * 100;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
									
							}
							System.out.print("\n");
							System.out.print("\n\n");
							break;

						case 2:
							movie = "maharaja";
							System.out.print("enter number of viewers: ");
							n3 = sc.nextInt();
							System.out.println("Choose your seat: ");
							System.out.println("1. Balcony");
							System.out.println("2. Gold");
							System.out.println("3. silver");
							System.out.println("Select your option: ");
							n5 = sc.nextInt();
							switch(n5) {
								case 1:
									n4 = n3 * 200;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 2:
									n4 = n3 * 150;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
								case 3:
									n4 = n3 * 100;
									System.out.println("Your Ticket bill is: " + (n4));
									break;
									
							}
							System.out.print("\n");
							System.out.print("\n\n");
							break;
						}
						break;
					}
				}
				break;

			case C:
				System.out.println("are you sure: ");
				System.out.println("Enter Y to cancel ticket: ");
				System.out.println("Enter N to cancel ticket: ");
				String s = sc.next();
				System.out.print("\n");
				System.out.print("==================================");
				System.out.print("\n\n");
				switch (s) {
				case "Y":
					area = "null";
					theatre = "null";
					movie = "null";
					n3 = 0;
					n4 = 0;
					System.out.println("your ticket is cancelled");
					System.out.print("\n");
					System.out.print("==================================");
					System.out.print("\n\n");
					break;
				case "N":
					System.out.print("\n");
					System.out.print("==================================");
					System.out.print("\n\n");
					break;

				}
				break;

			case I:
				System.out.println("Your Invoice\n");
				System.out.println("Area: " + area);
				System.out.println("Theatre: " + theatre);
				System.out.println("Movie: " + movie);
				System.out.println("Number of viewers: " + n3);
				System.out.println("Total Amount: " + n4);
				System.out.print("\n");
				System.out.print("==================================");
				System.out.print("\n\n");
				break;

			case E:
				System.out.println("Thank You!!");
				System.out.print("\n");
				System.out.print("==================================");
				System.out.print("\n\n");
				break;
			}
		}
	}
}
