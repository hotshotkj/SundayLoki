package com.upskill.jave_2;

public class ifelsestatement {

	public static void main(String[] args) {
		
		int age = 67;
		
		if (age <= 13){
         System.out.println("You are Children");
		} else if(age > 13 && age < 18){
			System.out.println("You are Teenager");
			}
	 else if (age >= 60){
		 if(age < 100){
			System.out.println("You are Senior");
		 } else
			System.out.println("You are Champion");
			
		} else {
	    	 System.out.println("You are Adult");
	    	 
		} 
	    	
			      
	}

}
