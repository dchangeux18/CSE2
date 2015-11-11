////////////////////////////////////////////////////////////////////////////////
//Danelia Changeux
//11/10/15
//CSE2 
//First Compile the program 
// javac CSE2Linear.java
//Then run the program 
// java CSE2Linear

import java.util.Scanner;

public class CSE2Linear {
  // the shuffling method
	public static int[] shuffle(int[] list) {
        int rand =0;
        int temp = 0;
	
	for(int i=0; i< 15; i++) {
	   rand = (int) Math.floor(Math.random() * 15);
		  
		    if (rand ==0) {
			  i--;
			  continue;
		     }
		  
		      temp = list[0];
		    list[0] = list[rand];
		    list[rand] = temp;
	    }
	 return list;
}
// will check to see that the user has inserted the correct input
	public static Boolean check(String unit1) {
		int unit = 0;
		try { unit = Integer.parseInt(unit1); }
	 		catch (NumberFormatException e) {
		 		System.out.println("error: invalid value. Try again."); 
		 		return false;
	 		}
		return true;
    } // end of the check method



	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] finalG= new int[15];
		int i=0;
		System.out.println("Please enter the 15 final grades for grades in CSE2:");
		
		//loop will run through and accept an input for each grade
		for(i =0; i < 15; i++) {
			//takes input as string
			String test = input.next();
			
			                                  
			Boolean pass = check(test); // the method verify is called
			if(pass == false) {
				System.out.println("Please try again and enter an integer :");
				i--;
				continue;
			}
			
			else{
			//if test passes will set test integer to verify conditions 	
				int j = Integer.parseInt(test);
				
			//if number out of range will take appropriate action	
				if(j < 0 || j > 100 ) {
					System.out.println("Out of range please enter anumber between 0 and 100: ");
					i--; 
					continue;
				}
				finalG[i] = j;
				if(i != 0) {
					
					if(finalG[i] < finalG[i-1]) {						
					    System.out.println("INSERT A VALUE GREATER OR EQUAL TO THE LAST: ");
						i--;
					}
				}
				
			}
			//end of else statement
		}
		//end of for loop
		System.out.println("Final grades input are:");
		for (i =0; i < 15; i++) {
			System.out.println(finalG[i]);
		}
		
		//takes in input for value to find within array
		System.out.println("\n Insert a grade to find within the array:" );
		int in = input.nextInt();
		int k =0;
		
		
		//loop linearly searches array and prints out results
		for(i =1; i < 15; i++) {
			k++;
			if(finalG[i] == in) {
				System.out.println(in +" was found after "+ k+ " iterations");
				break;
				}
			if(i==14) {
				System.out.println(in+" was not found in the list");
			}
		}
		
		finalG = shuffle(finalG);
		
		//prints out recently shuffled array
		System.out.println("Scambled:");
		for (i =0; i < 15; i++) {
			System.out.println(finalG[i]);
		}

		//takes in input for value to find within array
		System.out.println("\n Insert a grade to find within the array:" );
		 in = input.nextInt();
		 k =0;
		
		
		//loop linearly searches array and prints out results
		for(i =1; i < 15; i++) {
			k++;
			if(finalG[i] == in) {
				System.out.println(in +" was found after "+ k+ " iterations");
				break;
				}
			if(i==14) {
				System.out.println(in+" was not found in the list");
			}
		}
	}
}




