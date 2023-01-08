package com.upskill.jave_2;

public class Loops {
	
/*
  Type of Loops
    1. For Loop
    2. While Loop
    3. Do While Loop
    4. Infinite Loop	
 */

	public static void main(String[] args) {
		practiceForLoop();
		practiceWhileLoop();
		practiceDoWhileLoop();
		practiceInfiniteLoop();
		practiceNestedForLoop();
		

	}

	public static  void practiceForLoop(){                         //we can do again & again will be given limit (lower limit/upper limit)
		
	 int i;
	 for(i =1; i<=1000; i++){
		  System.out.println("For Loops number = " + i);
		  
		  
	 }
	 
	}
	
	
	public static void practiceWhileLoop(){                            // do again and again until the condition match
       int i = 1;
       while(i<=10){
    	 System.out.println("While Loop number = " + i);
    	   i++;
    	   
       }   
      }	 
	
	public static void practiceDoWhileLoop(){                            // do each action then check the condition
		int i = 1;
		do{
			System.out.println("Do While Loops number = " + i);
			i++;
		} while (i<=100);
			
		}
	
	public static void practiceInfiniteLoop(){                                // Never ending loop
		int i;
		for (i = 1; ; i++){
			System.out.println("Infinite Loops number = " + i);
		}
	}
	
					//Nested Loop - loop inside another loop
		int i;													//Initialize i for loop 1
		int j;												//Initialize j for loop 2
		for (i=1; i<=10; i++){									//First loop for i
			for (j=1; j<=10; j++){								//Second loop for j
				int multipicationTable = i * j;					//Statement for loop 2
				System.out.print(multipicationTable + " ");
			}
			System.out.println(" ");							//Statement for loop 1
		}
	}
}
	


