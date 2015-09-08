///////////////////////////////////////////////////////////////////////////////
//Danelia Changeux
// 9-7-2015 
//CSE002
//Cyclometer Java Program 
//  first compile the program 
//      javac Cyclometer.java
//  run the program 
//      java Cyclometer
    //  define a class
public class Cyclometer{
    //add the main method 
public static void main(String[] args ){
        int secsTrip1=480;  // seconds of thefirst trip 
       	int secsTrip2=3220;  //seconds of the second trip
		int countsTrip1=1561;  // counts of the first trip 
		int countsTrip2=9037; // counts of the second trip 
		
		double wheelDiameter=27.0,  // needed to calculate
  	    PI=3.14159, 
  	    feetPerMile=5280,  // needed for conversions 
  	    inchesPerFoot=12,   // needed for conversions 
  	    secondsPerMinute=60;  //needed for conversions
    	double distanceTrip1, distanceTrip2,totalDistance;
    	
    	System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");
	    System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");
	    
	    distanceTrip1=countsTrip1*wheelDiameter*PI;// gives distance in inches
	    distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
	    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
	    totalDistance=distanceTrip1+distanceTrip2;
	    
	    
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
	    System.out.println("Trip 2 was "+distanceTrip2+" miles");
	    System.out.println("The total distance was "+totalDistance+" miles");



  

    
    
    
    
    
    
    }//end main method
}// end of class