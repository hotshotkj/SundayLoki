package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{

	
	 //Method Overloading 

	public static void main(String[] args) {
		car(4, "BMW");
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();
		

	}
	
	public static void car(){
		System.out.println("My car is Audi");
		
	}
	public static void car(int door){
		System.out.println("My car Audi ! it has door");
		
	}
	
	public static void car(String color){
		System.out.println("My car is Audi !, it has color: "+ color);
				
	}
	public static void car(int wheel, String brand){
		System.out.println("My car is "+ brand +" !, it has wheel: "+ wheel);
		
	}
	
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		int Bonus = 20000;
		int RentalIncome = 10000;
		int SideIncome = 5000;
		int newIncome = calculateAnnualIncome+Bonus+RentalIncome+SideIncome;
		System.out.println("My Annual Income = " + newIncome);
		
		}
	
	
	}


