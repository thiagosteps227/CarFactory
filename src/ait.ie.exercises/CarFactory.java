package ait.ie.exercises;

import java.util.Scanner;

public class CarFactory {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		CarDB carDB = new CarDB();

	}
	
	public static String getCarRegistration() {
		System.out.println("Enter Car registration: ");
		String carRegistration = sc.next();
		return carRegistration;
	}

}
