//Danelia Changeux
//10/15/15
//CSE002

//First Compile the Program
    // javac Twisty.java
//Then run the program
    // Twisty.java

import java.util.Scanner;
public class Twisty{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    int length = 0;
    int width = 0; 
    System.out.print("Input your desired length: ");
    while(!scan.hasNextInt()){ // the while loop will check to see if the given input is an integer
      System.out.println("Error: please type in an integer.");
      scan.next();
    }
    width = scan.nextInt();
    System.out.print("Input your desired width: ");
    while(!scan.hasNextInt()){ // the while loop will determine if the given input for the length is an integer
      System.out.println("Error: please type in an integer.");
      scan.next();
    }
    length = scan.nextInt();
    //width (i)
    for (int i = 0; i < length; i++) {
      
      //Length (j)
      for (int j = 0; j < width; j++) {
        for (int x = 0; x < i; x++) {
          System.out.print(" ");
        }
        System.out.print("#");
        for (int y = 0; y < (length - (i+1)) * 2; y++) {
          System.out.print(" ");
        }
        System.out.print("#");
        for (int z = 0; z < i; z++) {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}