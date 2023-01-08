package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

import javax.print.DocFlavor.STRING;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		// Array store multiple data using index
		
		int age = 30;
		int[] ageLoki = new int [] {25, 30, 35, 38, 40};
		
		//Array index           [0] [1] [2] [3] [4] 
		
		System.out.println("Student Age ; " + ageLoki[2]);
		System.out.println("Total Student : " + ageLoki.length);
		
		
		String name = "Kajal";
		String[] nameLoki = new String [] {"Badsha", "Mizu", "Kajal", "Rasel", "Bijoy"};
		
		
		 
		//Array index                  [0] [1] [2] [3] [4] [5]
		
		System.out.println("Student Name ; " + nameLoki[4]);
		System.out.println("Total Student Name:c" + nameLoki.length);
		
		

	

	
	// Multi-Dimentional Array
	
	int [][] ageLoki2D = {{25, 30, 35, 38, 40},          //[0][0] [0][1] [0][2] [0][3] [0][4]
			               {25, 30, 35}};                //[1][0] [1][1] [1][2] [1][3] [1][4]
	
	     System.out.println("Student Age 2D : " + ageLoki2D[0][3]);
	     
	     
	     //Hashmap store multiple data using key-value pair, Implementation of Map Interface
	     
	     HashMap<String, Integer> Student = new HashMap<String, Integer>();
	     
	     Student.put("Anik", 25);
	     Student.put("Kajal", 32);
	     Student.put("Badsha", 35);
	     Student.put("Saqiful", 42);
	     
	     System.out.println("Hashmap Student Age : "+ Student.get("Badsha"));
	     
	     
	     
	     HashMap<String, String> Capital = new HashMap<String, String>();
	     
	     Capital.put("Bangladesh", "Dhaka");
	     Capital.put("Delhi", "India");
	     Capital.put("London", "Englang");
	     Capital.put("Spain", "Madrid");
	     
	     System.out.println("Capital City ;" + Capital.get("Spain"));
	     
	     
	     
	     //Hashset store unordered collection containing unique value, Implementation of set interface
	     
	     HashSet<String> car = new HashSet<String>();
	     car.add("Tesla");
	     car.add("Audi");
	     car.add("Range Rover");
	     car.add("Honda");
	     
	     System.out.println("Car : " + car);
	     
	     
	     //HashTable store multiple data using key-value pair, but is Synchronized (only oneHashtable<K, V>an be modified)
	     
	    
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     

	     
	     
	
	}
}
