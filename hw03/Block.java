//////////////////////////////////////////////////////////////////////////////
//Danelia Changeux 
//HW03
//CSE002
//9-14-15
//Block Java Program 
//  first compile the program 
//      javac Block.java
//  run the program 
//      java Block
import java.util.Scanner; // this is the import class that goes outisde of the class and main method   
public class Block{         //define a class
    //add the main method 
public static void main(String[] args ){
//Create a scanner object
Scanner input = new Scanner (System.in);

System.out.println("Enter the length of the block: ");//prompts the user to enter the length of the block 
double length = input.nextDouble();//will read the users imput as a double

System.out.println("Enter the width of the block: ");// prompts the user to enter the width of the block 
double width = input.nextDouble(); //will read the users imput as a double

System.out.println("Enter the height of the block: ");//prompts the user to enter the height of the block
double height =input.nextDouble();//will read the users imput as a double

// the two following calculations are for the volume and the surface area    
double volume = length*width*height; 
double SA = (2*length*width)+(2*height*width)+(2*length*height); 

System.out.println("The volume of the block of dimensions "+length+" x "+width+" x "+height+" is "+volume+" .");
System.out.println("The surface are of the block is "+SA+".");
   
    }//end of main method
}//end of class