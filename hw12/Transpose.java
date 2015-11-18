////////////////////////////////////////////////////////////////////////////////
//Danelia Changeux 
//11/15/2015
//CSE002
// First Compile the program 
// javac Transpose.java
// then run the program 
// java Transpose
import java.util.Scanner; 
public class Transpose{
        public static void main(String[] args){
        int i, j; 
        Scanner input = new Scanner(System.in);
         
        System.out.println("Please enter the width of the matrix: ");
                while(!input.hasNextInt()){ // the while loop will repeatedly ask the user to enter the correct input if an integer is not given 
                   System.out.println("Bad Input Please try again!");
                    input.next();
                }
                  i = input.nextInt(); 
         
        System.out.println("Please enter the height of the matrix: ");
                while(!input.hasNextInt()){// the while loop will repeatedly ask the user to enter the correct input if an integer is not given 
                   System.out.println("Bad Input Please try again!");
                        input.next();
                }
                 j = input.nextInt(); 
        
        int[][] Mx = new int [i][j]; 
        
        System.out.println("Here is the your desired Matrix: ");
                 printMatrix(Mx);//we are calling the printMatrix method 
         
        System.out.println("Here is the transposed Matrix: ");
                transposeMatrix(Mx);//we are calling the transposeMatrix method
        }
    // this method takes two variables and creates a matrix
    public static void randomMatrix(int[][] matrix){
        int variable = (int)(Math.random()*(21)-10);
            for(int width = 0; width < matrix.length; width++){
                for(int height = 0; height < matrix[width].length; height++){
                        matrix[width][height]= (int)(Math.random()*(21) -10);
                }// end of inner for loop 
            }// end of outer for loop 
    }// end of randomMatrix method

   // this method will print out the matrix with the users dimensions 
   public static void printMatrix(int[][] matrix){
        int variable = (int)(Math.random()*(21) -10);
            for(int i = 0; i < matrix.length; i++){
                   for(int j = 0; j < matrix[i].length; j++){
                        matrix[i][j]= (int)(Math.random()*(21) -10);
                         System.out.print(matrix[i][j] + " ");
                   }//end of inner for loop
                     System.out.println(); 
            }//end of outer for loop
   }// end of printMatrix method 
    
    // this method will transpose the matrix as the height becomes the width and vice versa
    public static void transposeMatrix(int [][] list){
           int [][] transpose = new int [list[0].length][list.length];
           for(int i = 0; i < transpose.length; i++){
                   for(int j = 0; j < transpose[i].length; j++){
                        transpose[i][j] = list [j][i]; 
                        System.out.print(list[j][i] + " ");
                   }//end of inner for loop 
           System.out.println();   
           }// end of outer for loop 
        
    }// end of the transposeMatrix method

    
}// end of the class



















