package ait.ie.exercises;

import java.util.Scanner;


public class CarFactory {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		CarDB carDB = new CarDB();
		String option = "";
		
		while (!option.equals("q")) {
			
			System.out.println("Welcome to the Car Application\n"
					+ "======================================================\n"
					+ "Enter 'a' to add a new Car\n"
					+ "Enter 'f' to fetch a cars details by its registration\n"
					+ "Enter 'c' to change car color\n"
					+ "Enter 'k' to update no. of kilometers\n"
					+ "Enter 'q' to quit");
			option = sc.next();
			
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
				
			} else if (option.equals("c")) {
				
				System.out.print("Enter car registration: ");
				String registration = sc.next();
				String currentColor = carDB.findCarByReg(registration).getColor();
				
				System.out.println("\nThe car is currently: "+ currentColor);
				
				System.out.print("Enter new color: ");
				String newColor = sc.next();
				carDB.findCarByReg(registration).setColor(newColor);
				
				System.out.println("Color for "+carDB.findCarByReg(registration).getRegistration()+
						" changed from "+ currentColor + " to "+newColor);
			} else if (option.equals("k")) {
				
				System.out.print("Enter car registration: ");
				String registration = sc.next();
				
				System.out.print("\nEnter no. of Kilometers: ");
				int newNumberOfKilometers = sc.nextInt();
				
				int carKilometers = carDB.findCarByReg(registration).getKilometers();
				
				if (newNumberOfKilometers > carKilometers) {
					carDB.findCarByReg(registration).setKilometers(newNumberOfKilometers);
					System.out.println("Kilometers is now "+ carDB.findCarByReg(registration).getKilometers());
				} else {
					System.out.println("Sorry you put back the odometer");
				}
			}
		}
		System.out.println(carDB.totalOfCars()+" have been created\nGoodBye!!");
	}
}
				
		
