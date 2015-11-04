/////////////////////////////////////////////////////////////////////////////////
//Danelia Changeux
//10/19/15
//CSE002
// First Compile the Program
    // Javac Area.java
//Then run the program
    // java Area
import java.util.Scanner; 
public class StringAnalysis {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a string");
        String in = input.next();
        loop(in);
    }
    public static void loop (String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isLetter(input.charAt(i))) {
                count++;
            }
        }
        System.out.println("You have " +count+ " non letters in your string");
    }
}

        