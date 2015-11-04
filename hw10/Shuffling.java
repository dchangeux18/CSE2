////////////////////////////////////////////////////////////////////////////////\
//Danelia Changeux 
//CSE002 
//11/03/2015 
//hw 10 
// First compile the program 
    //javac Shuffling.java
// Then run the program 
    // java Shuffling
public class Shuffling{
    // the following method will print out each element of the list
    public static void printArray(String []list){
         for (int i = 0; i < list.length; i++) {
             System.out.print(list[i]+ " ");
         }
         System.out.println();
      }// end of the printArray method
      
      //this method will shuffle the cards a number of less than fifty times
    public static void shuffle(String [] list){
       System.out.println(); 
       System.out.println("Shuffled");
       for(int i = 0; i < 60;i++){ // the for loop will make sure that the deck is suffled less than 50 times if not fifty times
           // the following four lines will take the card in the first index and shuffle it with the last
           int rand =(int)(Math.random()*51);
           String temp = list[rand];
           list[rand]=list[0];
           list[0] = temp;
       }
    }// end of the shuffle method

    // this method will pick out five cards at random and return them
    public static String [] randomizeHand(String [] list ){
        System.out.println();
        System.out.println("Randomized Hand");
        String [] hand = new String[5]; //setting the array to a limit of five  for the five cards
        for(int i=0; i<5 ; i++){ // the for loop will run five times to chose the five cards
             int rand =(int)(Math.random()*51); // will pick a random card from the deck
            // the if statement will check to make sure that the same cards are not picked twice
            if(list[rand].equals(hand[0])||list[rand].equals(hand[1])||list[rand].equals(hand[2])||list[rand].equals(hand[3])||list[rand].equals(hand[4])){
                rand = (int)(Math.random()*51); //will call again to pick a random card
            }
            hand [i] = list[rand];
        }
        return hand; // this will return the five random cards
    }// end of teh randomizeHand method
  
  public static void main(String[] args) {
	//suits club, heart, spade or diamond
    String[] suitNames={"C","H","S","D"};   
    String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
    String[] cards = new String[52];
    String[] hand = new String[5];
    // the following for loop will print out the 52 cards of the deck
    for (int i=0; i<52; i++){ 
        cards[i]=rankNames[i%13]+suitNames[i/13];
            System.out.print(cards[i]+" ");
    }
    shuffle(cards);// callling the shuffle method
    printArray(cards);// calling the printArray method
    hand = randomizeHand(cards); // calling the randomizeHand method
    printArray(hand); // calling the printArray Method once more
  }// end of the main method
}// end of the class
