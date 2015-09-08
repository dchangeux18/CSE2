///////////////////////////////////////////////////////////////////////////////
//Danelia Changeux
// 9-7-2015 
//CSE002
//Arithmetic Java Program 
//  first compile the program 
//      javac Arithmetic.java
//  run the program 
//      java Arithmetic
    //  define a class
public class Arithmetic{
    //add the main method 
public static void main(String[] args ){
 
  int nSocks=3; //Number of pairs of socks
  int nEnvelopes=1;//Number of boxes of envelopes
  int nGlasses=6; //Number of glasses
  double sockCost$=2.58;// cost per pair of socks
  double glassCost$=2.29;//Cost per glass
  double envelopeCost$=3.25;
  double taxPercent=0.06;//cost per box of envelopes


  double totalSockCost$ =nSocks*sockCost$ ;   //total cost of socks
  double totalGlassCost$ =nGlasses*glassCost$; //total cost of glasses
  double totalEnvelopeCost$=nEnvelopes*envelopeCost$; //total cost of envelopes 
  double totalcostb4tax$= (totalSockCost$ +totalEnvelopeCost$ + totalGlassCost$) ; // calculation of total paid for the transaction before tax
  double totalcost$=(((nSocks*sockCost$) +(nEnvelopes*envelopeCost$) +(nGlasses*glassCost$)) * taxPercent) +  totalcostb4tax$;// the total cost of the items after tax
// the following two calculations will take the totalcost$ and format it to be in $00.00 format 
  double TotalCost$ = totalcost$ * 100; 
  double TCTax$ = (int) TotalCost$/100.0;
  
  System.out.println("The Cost for " + nSocks + " socks is $" + totalSockCost$); // prints the cost of three socks
  System.out.println("The Cost for " + nGlasses + " glasses is $" + totalGlassCost$);// prints the cost of the 6 glasses
  System.out.println("The Cost for " + nEnvelopes + " envelopes is $" + totalEnvelopeCost$); //prints the cost of 1 envelope
  System.out.println("The total paid for the transaction BEFORE tax is $" + totalcostb4tax$);// prints the total of the transaction before tax
  System.out.println("The total paid for the transaction AFTER tax is $" + TCTax$); // prints the total of the transaction after tax
      }
}