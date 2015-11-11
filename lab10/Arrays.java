//////////////////////////////////////////////////////////////////////////
//Danelia Changeux
//lab10
//11/2/2015
//CSE002 
//first compile the program 
    //javac Arrays.java
//Then run the program
    //java Arrays
import java.util.Scanner; 
public class Arrays{
    public static void main(String[]args){
        int i = ((int)(Math.random()*5) +5);
        int j = (int)(Math.random()*100);
        int k;
        String in;
        String[]students = new String [i];
        int midterm [];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter "+i+"student names: ");
        for(i=1; i<= students.length; i++){
           in = input.next();
        }
        
         for(k = 0; k < i; k++){
             midterm = new int [j] ;
         }
       
       
       System.out.println("Here are the midterm grades of the "+i+" students above: ");
         for( k = 0; k < i; k++){
        System.out.println(students[k]+" :"+int midterm[k]);
         }
    }
}