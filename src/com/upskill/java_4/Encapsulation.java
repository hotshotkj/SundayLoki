package com.upskill.java_4;

public class Encapsulation {
	
	private String name = "Walgreens";
	private int ssn = 55228876;
	private String username = "Mahmudur";
	
	//setter Method
	public void setName(String value){
		name = value;
		
	}
	public void setSSN(int value){
		ssn = value;
		
	}
	
	
	//Getter Method
	public String getName(){
		return name;
		
	}
	
	
	
	

	public static void main(String[] args) {
		Encapsulation obj =  new Encapsulation();
		
		obj.setName("Walgreens2");
		System.out.println(obj.getName());
	}
	
		
		public String getUserName(){
			return username;
	
			obj.setSSN(55228876);
			System.out.println(obj.getUserName());
			 
		
		
		}
		
	
	
		
		
	
		

	}


