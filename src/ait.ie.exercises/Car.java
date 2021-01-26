package ait.ie.exercises;

public class Car {
	private String registration;
	private static int numberOfCars;
	private String model;
	private String make;
	private String color;
	private int kilometers;
	
	public Car(String registration, String model, String make, String color) {
		this.registration = registration;
		this.model = model;
		this.make = make;
		this.color = color;
	}
	
	public String getRegistration() {
		return registration;
	}
	
	public int getKilometers() {
		return kilometers;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	
	public static int getNumbersOfCars() {
		return numberOfCars;
	}
	
	@Override
	public String toString() {
		return 
	}
}
