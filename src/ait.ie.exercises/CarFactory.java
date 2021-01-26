package ait.ie.exercises;

import java.util.Scanner;


public class CarFactory {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		CarDB carDB = new CarDB();
		
		System.out.println("Welcome to the Car Application\n"
				+ "======================================================\n"
				+ "Enter 'a' to add a new Car\n"
				+ "Enter 'f' to fetch a cars details by its registration\n"
				+ "Enter 'c' to change car color\n"
				+ "Enter 'k' to update no. of kilometers\n"
				+ "Enter 'q' to quit");
		String option = sc.next();
		
		if(option.equals("a")) {
			System.out.println("Enter car registration");
			String registration = sc.next();
			System.out.println("Enter car make");
			String carMake= sc.next();
			System.out.println("Enter car model");
			String model = sc.next();
			System.out.println("Enter car color");
			String color = sc.next();
			
			Car car = new Car(registration, model, carMake, color);
			
			carDB.addCar(car);
			
		} else if(option.equals("f")) {
			 
			System.out.println("Enter car registration");
			String registration = sc.next();
			
			System.out.println(carDB.findCarByReg(registration).toString());
		}
	}
	
	public static String getCarRegistration() {
		System.out.println("Enter Car registration: ");
		String carRegistration = sc.next();
		return carRegistration;
	}
	
}
