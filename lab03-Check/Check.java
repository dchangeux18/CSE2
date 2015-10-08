///////////////////////////////////////////////////////////////////////////////
//Danelia Changeux 
//HW03
//CSE002
//9-10-15
//Timer Java Program 
//  first compile the program 
//      javac Check.java
//  run the program 
//      java Check 

import java.util.Scanner; // this is the import class that goes outisde of the class and main method   

public class Check{         //  define a class
    //add the main method 
public static void main(String[] args ){
//Create a scanner object
Scanner input = new Scanner (System.in);

System.out.print("Enter the original cost of the check in the form xx.xx: ");

double checkCost = input.nextDouble();
System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
double tipPercent = input.nextDouble();
tipPercent /= 100; //We want to convert the percentage into a decimal value
System.out.print("Enter the number of people who went out to dinner: ");
int numPeople = input.nextInt();
double totalCost; //whole dollar amount of cost
double costPerPerson;
int dollars,dimes, pennies;   
totalCost = checkCost * (1 + tipPercent);

dollars=(int)costPerPerson;
dimes=(int)(costPerPerson * 10) % 10;
pennies=(int)(costPerPerson * 100) % 10;
System.out.println("Each person in the group owes $ "+ dollars +"." + dimes + pennies);

    }
}
