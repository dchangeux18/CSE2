///////////////////////////////////////////////////////////////////////////////
//Danelia Changeux 
//HW03
//CSE002
//9-14-15
//Timer Java Program 
//  first compile the program 
//      javac Timer.java
//  run the program 
//      java Timer
import java.util.Scanner; // this is the import class that goes outisde of the class and main method   
public class Timer{         //  define a class
    //add the main method 
public static void main(String[] args ){
//Create a scanner object
Scanner input = new Scanner (System.in);
//Prompt the user to enter the current time
System.out.println("Enter the current time: "); 
 int time = input.nextInt(); //reads an integer when the user is prompted to enter the current time
 
System.out.println("Enter the time that you will be eating dinner: "); 
 int dinner = input.nextInt(); //will read an integer when the user is prompted to enter the time they will eat dinner
 
 int hours = ((dinner/100)-(time/100)); // this calculates the amount of hours until dinner 
 int miuntes = ((dinner-time)-(hours*100)); // this will calculate the minutes until dinner
 
System.out.println("You have "+hours+" hours and "+miuntes+" minutes until dinner.");
 }//end of the main method
}// end of the class
 