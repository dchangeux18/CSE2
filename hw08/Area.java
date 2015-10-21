    /////////////////////////////////////////////////////////////////////////////////
    //Danelia Changeux
    //10/19/15
    //CSE002
    // First Compile the Program
        // Javac Area.java
    //Then run the program
        // java Area
import java.util.Scanner; 
        
public class Area{
    public static void main(String[]args){
        input(); 
    }  
    // this method will check to see if the user woudl like to calculate the area of a triangle, circle or rectangle 
    // this mehtod will also chcek to see if the user has inputed a double
    public static void input(){ //
        Scanner input = new Scanner(System.in); 
        System.out.println("Ask for the area of a triangle, circle, or rectangle"); 
        String word = input.next();
        word = word.toLowerCase();
        while(true){
            if(word.equals("circle")||word.equals("triangle")||word.equals("rectangle")){
                break;
            }else{
                System.out.println("Bad Input Please try Again");
                word = input.next();
            }
               
        }
        if(word.equals("circle")){
            double radius = 0;
            System.out.println("Enter a radius");
            while(!input.hasNextDouble()){
                System.out.println("Please Enter a Double");
                input.next();
            }
            radius = input.nextDouble();
            double answerc = cirarea(radius);
            System.out.println("The area is " +answerc);
        }
        if(word.equals("triangle")){
            double base = 0;
            System.out.println("Enter a base");
            while(!input.hasNextDouble()){
                System.out.println("Please Enter a Double");
                input.next();
            }
            base = input.nextDouble(); 
            double height = 0;
            System.out.println("Enter a height");
            while(!input.hasNextDouble()){
                System.out.println("Please Enter a Double");
                input.next();
            }
            height = input.nextDouble();
            double answert = triarea(base,height); 
            System.out.println("The area is " +answert);
        }
        if(word.equals("rectangle")){
            double length = 0;
            System.out.println("Enter a length");
            while(!input.hasNextDouble()){
                System.out.println("Please Enter a Double");
                input.next();
            }
            length = input.nextDouble();
            double width = 0;
            System.out.println("Enter a height");
            while(!input.hasNextDouble()){
                System.out.println("Please Enter a Double");
                input.next();
            }
            width = input.nextDouble();
            double answert = rectarea(length,width); 
            System.out.println("The area is " +answert);
        }
            
    } // this methofd will calculate the area of a rectangle
    static double rectarea(double length, double width) {
        double rectarea = length * width; 
        return rectarea; 
    } // this method will calculate the are of a triangle
    static double triarea(double base, double height){
        double triarea=(base*height)/2 ;
        return triarea ;
    }// this method will calculate the area of a circle
    static double cirarea(double radius){
        double circarea = Math.PI * Math.pow(radius, 2);
        return circarea; 
    }
}  
            
        