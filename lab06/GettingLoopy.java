////////////////////////////////////////////////////////////////////////////////
//Danelia Changeux
//lab06
//CSE002 
// First Compile the program 
    //javac GettingLoopy.java
//Then run the program 
    //java GettingLoopy 

public class GettingLoopy{
    public static void main(String [] args){
        int i = 1;
        int j = 0;
       System.out.println("Step 1: ");
        while(i <= 6){
            System.out.print(i);
            i++;
        }
        while(j < 7){
            System.out.print("7");
            j++;
            
        }
        System.out.println("Step 2: ");
        int number = 0;
        int k = 0 ;
            
            while( k >= 10 && k <= 100){
                
                if (k % k == 0){
                    System.out.print(number+" ");
                }
                k++;
            }  
        
    }
    
}