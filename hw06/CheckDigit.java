///////////////////////////////////////////////////////////////////////////////
//Danelia Changeux 
//10/06/2015
//hw05-Bar Graph
import java.util.Scanner; // this is the import class that goes outisde of the class and main method 
public class CheckDigit{         //  define a class
    //add the main method 
public static void main(String[] args ){
//Create a scanner object

    Scanner input = new Scanner (System.in);
System.out.println("Please enter a 10 digit barcode: ");
 int time = input.nextInt();
 
 int first = time /1000000000;
 int second = (time /100000000)-(first*10); 
 int third =(time/10000000)-(first*100)-(second*10);
 int fourth =(time/1000000)-(first*1000)-(second*100)-(third*10);
 int fifth =(time/100000)-(first*10000)-(second*1000)-(third*100)-(fourth*10);
 int sixth =(time/10000)-(first*100000)-(second*10000)-(third*1000)-(fourth*100)-(fifth*10);
 int seventh =(time/1000)-(first*1000000)-(second*100000)-(third*10000)-(fourth*1000)-(fifth*100)-(sixth*10);
 int eigth =(time/100)-(first*10000000)-(second*1000000)-(third*100000)-(fourth*10000)-(fifth*1000)-(sixth*100)-(seventh*10);
 int ninth =(time/10)-(first*100000000)-(second*10000000)-(third*1000000)-(fourth*100000)-(fifth*10000)-(sixth*1000)-(seventh*100)-(eigth*10);
 int tenth =(time/1)-(first*1000000000)-(second*100000000)-(third*10000000)-(fourth*1000000)-(fifth*100000)-(sixth*10000)-(seventh*1000)-(eigth*100)-(ninth*10);
 
 int sum =((first*10)+(second*9)+(third*8)+(fourth*7)+(fifth*6)+(sixth*5)+(seventh*4)+(eigth*3)*(ninth*2)+(tenth));
 
 int check =sum%11;
 
if(check==tenth){
    System.out.println("This is a good ISBN #");
}else{
    System.out.println("This is a bad ISBN # please try again");
}

    }
}
