//Emily Weston
//9-19-15
//HW 04
//Poker Hand Check
//
//the purpose of this program is to practice using selection statements,
//operators, and String manipulation

public class PokerHandCheck {
    
    public static void main(String[] args) {
        
        
        
        int card1=(int)(Math.random()*52)+1; //declares and assigns a random value for the card in deck 1
        String printCard1=""; //declares the string for the switch statements to use
        
        switch (card1) { //assigns card value for deck 1
            case 1:
                printCard1="Ace";
            break;
            case 2:
                printCard1="2";
            break;
            case 3:
                printCard1="3";
            break;
            case 4:
                printCard1="4";
            break;
            case 5:
                printCard1="5";
            break;
            case 6:
                printCard1="6";
            break;
            case 7:
                printCard1="7";
            break;
            case 8:
                printCard1="8";
            break;
            case 9:
                printCard1="9";
            break;
            case 10:
                printCard1="10";
            break;
            case 11:
                printCard1="Jack";
            break;
            case 12:
                printCard1="Queen";
            break;
            case 13:
                printCard1="King";
            break;
            // end of diamonds suit
            
            case 14:
                printCard1="Ace";
            break;
            case 15:
                printCard1="2";
            break;
            case 16:
                printCard1="3";
            break;
            case 17:
                printCard1="4";
            break;
            case 18:
                printCard1="5";
            break;
            case 19:
                printCard1="6";
            break;
            case 20:
                printCard1="7";
            break;
            case 21:
                printCard1="8";
            break;
            case 22:
                printCard1="9";
            break;
            case 23:
                printCard1="10";
            break;
            case 24:
                printCard1="Jack";
            break;
            case 25:
                printCard1="Queen";
            break;
            case 26:
                printCard1="King";
            break;
            // end of clubs suit
            
            case 27:
                printCard1="Ace";
            break;
            case 28:
                printCard1="2";
            break;
            case 29:
                printCard1="3";
            break;
            case 30:
                printCard1="4";
            break;
            case 31:
                printCard1="5";
            break;
            case 32:
                printCard1="6";
            break;
            case 33:
                printCard1="7";
            break;
            case 34:
                printCard1="8";
            break;
            case 35:
                printCard1="9";
            break;
            case 36:
                printCard1="10";
            break;
            case 37:
                printCard1="Jack";
            break;
            case 38:
                printCard1="Queen";
            break;
            case 39:
                printCard1="King";
            break;
            //end of hearts suit
            
            case 40:
                printCard1="Ace";
            break;
            case 41:
                printCard1="2";
            break;
            case 42:
                printCard1="3";
            break;
            case 43:
                printCard1="4";
            break;
            case 44:
                printCard1="5";
            break;
            case 45:
                printCard1="6";
            break;
            case 46:
                printCard1="7";
            break;
            case 47:
                printCard1="8";
            break;
            case 48:
                printCard1="9";
            break;
            case 49:
                printCard1="10";
            break;
            case 50:
                printCard1="Jack";
            break;
            case 51:
                printCard1="Queen";
            break;
            case 52:
                printCard1="King";
            break;
            //end of spades suit
        } //end of deck 1
        
        
        
        int card2=(int)(Math.random()*52)+1; //declares and assigns a random value for the card in deck 2
        String printCard2=""; //declares the string for the switch statements to use
        
        switch (card2) { //assigns card value for deck 2
            case 1:
                printCard2="Ace";
            break;
            case 2:
                printCard2="2";
            break;
            case 3:
                printCard2="3";
            break;
            case 4:
                printCard2="4";
            break;
            case 5:
                printCard2="5";
            break;
            case 6:
                printCard2="6";
            break;
            case 7:
                printCard2="7";
            break;
            case 8:
                printCard2="8";
            break;
            case 9:
                printCard2="9";
            break;
            case 10:
                printCard2="10";
            break;
            case 11:
                printCard2="Jack";
            break;
            case 12:
                printCard2="Queen";
            break;
            case 13:
                printCard2="King";
            break;
            // end of diamonds suit
            
            case 14:
                printCard2="Ace";
            break;
            case 15:
                printCard2="2";
            break;
            case 16:
                printCard2="3";
            break;
            case 17:
                printCard2="4";
            break;
            case 18:
                printCard2="5";
            break;
            case 19:
                printCard2="6";
            break;
            case 20:
                printCard2="7";
            break;
            case 21:
                printCard2="8";
            break;
            case 22:
                printCard2="9";
            break;
            case 23:
                printCard2="10";
            break;
            case 24:
                printCard2="Jack";
            break;
            case 25:
                printCard2="Queen";
            break;
            case 26:
                printCard2="King";
            break;
            // end of clubs suit
            
            case 27:
                printCard2="Ace";
            break;
            case 28:
                printCard2="2";
            break;
            case 29:
                printCard2="3";
            break;
            case 30:
                printCard2="4";
            break;
            case 31:
                printCard2="5";
            break;
            case 32:
                printCard2="6";
            break;
            case 33:
                printCard2="7";
            break;
            case 34:
                printCard2="8";
            break;
            case 35:
                printCard2="9";
            break;
            case 36:
                printCard2="10";
            break;
            case 37:
                printCard2="Jack";
            break;
            case 38:
                printCard2="Queen";
            break;
            case 39:
                printCard2="King";
            break;
            //end of hearts suit
            
            case 40:
                printCard2="Ace";
            break;
            case 41:
                printCard2="2";
            break;
            case 42:
                printCard2="3";
            break;
            case 43:
                printCard2="4";
            break;
            case 44:
                printCard2="5";
            break;
            case 45:
                printCard2="6";
            break;
            case 46:
                printCard2="7";
            break;
            case 47:
                printCard2="8";
            break;
            case 48:
                printCard2="9";
            break;
            case 49:
                printCard2="10";
            break;
            case 50:
                printCard2="Jack";
            break;
            case 51:
                printCard2="Queen";
            break;
            case 52:
                printCard2="King";
            break;
            //end of spades suit
        } //end of deck 2
        
        
        
        int card3=(int)(Math.random()*52)+1; //declares and assigns a random value for the card in deck 3
        String printCard3=""; //declares the string for the switch statements to use
        
        switch (card3) { //assigns card value for deck 3
            case 1:
                printCard3="Ace";
            break;
            case 2:
                printCard3="2";
            break;
            case 3:
                printCard3="3";
            break;
            case 4:
                printCard3="4";
            break;
            case 5:
                printCard3="5";
            break;
            case 6:
                printCard3="6";
            break;
            case 7:
                printCard3="7";
            break;
            case 8:
                printCard3="8";
            break;
            case 9:
                printCard3="9";
            break;
            case 10:
                printCard3="10";
            break;
            case 11:
                printCard3="Jack";
            break;
            case 12:
                printCard3="Queen";
            break;
            case 13:
                printCard3="King";
            break;
            // end of diamonds suit
            
            case 14:
                printCard3="Ace";
            break;
            case 15:
                printCard3="2";
            break;
            case 16:
                printCard3="3";
            break;
            case 17:
                printCard3="4";
            break;
            case 18:
                printCard3="5";
            break;
            case 19:
                printCard3="6";
            break;
            case 20:
                printCard3="7";
            break;
            case 21:
                printCard3="8";
            break;
            case 22:
                printCard3="9";
            break;
            case 23:
                printCard3="10";
            break;
            case 24:
                printCard3="Jack";
            break;
            case 25:
                printCard3="Queen";
            break;
            case 26:
                printCard3="King";
            break;
            // end of clubs suit
            
            case 27:
                printCard3="Ace";
            break;
            case 28:
                printCard3="2";
            break;
            case 29:
                printCard3="3";
            break;
            case 30:
                printCard3="4";
            break;
            case 31:
                printCard3="5";
            break;
            case 32:
                printCard3="6";
            break;
            case 33:
                printCard3="7";
            break;
            case 34:
                printCard3="8";
            break;
            case 35:
                printCard3="9";
            break;
            case 36:
                printCard3="10";
            break;
            case 37:
                printCard3="Jack";
            break;
            case 38:
                printCard3="Queen";
            break;
            case 39:
                printCard3="King";
            break;
            //end of hearts suit
            
            case 40:
                printCard3="Ace";
            break;
            case 41:
                printCard3="2";
            break;
            case 42:
                printCard3="3";
            break;
            case 43:
                printCard3="4";
            break;
            case 44:
                printCard3="5";
            break;
            case 45:
                printCard3="6";
            break;
            case 46:
                printCard3="7";
            break;
            case 47:
                printCard3="8";
            break;
            case 48:
                printCard3="9";
            break;
            case 49:
                printCard3="10";
            break;
            case 50:
                printCard3="Jack";
            break;
            case 51:
                printCard3="Queen";
            break;
            case 52:
                printCard3="King";
            break;
            //end of spades suit
        } //end of deck 3
        
        
        
        int card4=(int)(Math.random()*52)+1; //declares and assigns a random value for the card in deck 4
        String printCard4=""; //declares the string for the switch statements to use
        
        switch (card4) { //assigns card value for deck 4
            case 1:
                printCard4="Ace";
            break;
            case 2:
                printCard4="2";
            break;
            case 3:
                printCard4="3";
            break;
            case 4:
                printCard4="4";
            break;
            case 5:
                printCard4="5";
            break;
            case 6:
                printCard4="6";
            break;
            case 7:
                printCard4="7";
            break;
            case 8:
                printCard4="8";
            break;
            case 9:
                printCard4="9";
            break;
            case 10:
                printCard4="10";
            break;
            case 11:
                printCard4="Jack";
            break;
            case 12:
                printCard4="Queen";
            break;
            case 13:
                printCard4="King";
            break;
            // end of diamonds suit
            
            case 14:
                printCard4="Ace";
            break;
            case 15:
                printCard4="2";
            break;
            case 16:
                printCard4="3";
            break;
            case 17:
                printCard4="4";
            break;
            case 18:
                printCard4="5";
            break;
            case 19:
                printCard4="6";
            break;
            case 20:
                printCard4="7";
            break;
            case 21:
                printCard4="8";
            break;
            case 22:
                printCard4="9";
            break;
            case 23:
                printCard4="10";
            break;
            case 24:
                printCard4="Jack";
            break;
            case 25:
                printCard4="Queen";
            break;
            case 26:
                printCard4="King";
            break;
            // end of clubs suit
            
            case 27:
                printCard4="Ace";
            break;
            case 28:
                printCard4="2";
            break;
            case 29:
                printCard4="3";
            break;
            case 30:
                printCard4="4";
            break;
            case 31:
                printCard4="5";
            break;
            case 32:
                printCard4="6";
            break;
            case 33:
                printCard4="7";
            break;
            case 34:
                printCard4="8";
            break;
            case 35:
                printCard4="9";
            break;
            case 36:
                printCard4="10";
            break;
            case 37:
                printCard4="Jack";
            break;
            case 38:
                printCard4="Queen";
            break;
            case 39:
                printCard4="King";
            break;
            //end of hearts suit
            
            case 40:
                printCard4="Ace";
            break;
            case 41:
                printCard4="2";
            break;
            case 42:
                printCard4="3";
            break;
            case 43:
                printCard4="4";
            break;
            case 44:
                printCard4="5";
            break;
            case 45:
                printCard4="6";
            break;
            case 46:
                printCard4="7";
            break;
            case 47:
                printCard4="8";
            break;
            case 48:
                printCard4="9";
            break;
            case 49:
                printCard4="10";
            break;
            case 50:
                printCard4="Jack";
            break;
            case 51:
                printCard4="Queen";
            break;
            case 52:
                printCard4="King";
            break;
            //end of spades suit
        } //end of deck 4
        
        
        
        int card5=(int)(Math.random()*52)+1; //declares and assigns a random value for the card in deck 5
        String printCard5=""; //declares the string for the switch statements to use
        
        switch (card5) { //assigns card value for deck 5
            case 1:
                printCard5="Ace";
            break;
            case 2:
                printCard5="2";
            break;
            case 3:
                printCard5="3";
            break;
            case 4:
                printCard5="4";
            break;
            case 5:
                printCard5="5";
            break;
            case 6:
                printCard5="6";
            break;
            case 7:
                printCard5="7";
            break;
            case 8:
                printCard5="8";
            break;
            case 9:
                printCard5="9";
            break;
            case 10:
                printCard5="10";
            break;
            case 11:
                printCard5="Jack";
            break;
            case 12:
                printCard5="Queen";
            break;
            case 13:
                printCard5="King";
            break;
            // end of diamonds suit
            
            case 14:
                printCard5="Ace";
            break;
            case 15:
                printCard5="2";
            break;
            case 16:
                printCard5="3";
            break;
            case 17:
                printCard5="4";
            break;
            case 18:
                printCard5="5";
            break;
            case 19:
                printCard5="6";
            break;
            case 20:
                printCard5="7";
            break;
            case 21:
                printCard5="8";
            break;
            case 22:
                printCard5="9";
            break;
            case 23:
                printCard5="10";
            break;
            case 24:
                printCard5="Jack";
            break;
            case 25:
                printCard5="Queen";
            break;
            case 26:
                printCard5="King";
            break;
            // end of clubs suit
            
            case 27:
                printCard5="Ace";
            break;
            case 28:
                printCard5="2";
            break;
            case 29:
                printCard5="3";
            break;
            case 30:
                printCard5="4";
            break;
            case 31:
                printCard5="5";
            break;
            case 32:
                printCard5="6";
            break;
            case 33:
                printCard5="7";
            break;
            case 34:
                printCard5="8";
            break;
            case 35:
                printCard5="9";
            break;
            case 36:
                printCard5="10";
            break;
            case 37:
                printCard5="Jack";
            break;
            case 38:
                printCard5="Queen";
            break;
            case 39:
                printCard5="King";
            break;
            //end of hearts suit
            
            case 40:
                printCard5="Ace";
            break;
            case 41:
                printCard5="2";
            break;
            case 42:
                printCard5="3";
            break;
            case 43:
                printCard5="4";
            break;
            case 44:
                printCard5="5";
            break;
            case 45:
                printCard5="6";
            break;
            case 46:
                printCard5="7";
            break;
            case 47:
                printCard5="8";
            break;
            case 48:
                printCard5="9";
            break;
            case 49:
                printCard5="10";
            break;
            case 50:
                printCard5="Jack";
            break;
            case 51:
                printCard5="Queen";
            break;
            case 52:
                printCard5="King";
            break;
            //end of spades suit
        } //end of deck 5
        
        
        
        
        
        System.out.println("Your random cards were:");
        //assigns suit value for deck 1
        //prints the card identity for deck 1
        if (card1<=13){
            System.out.println("the "+printCard1+" of diamonds.");
        }
        else if (card1>=14 && card1<=26){
            System.out.println("the "+printCard1+" of clubs.");
        }
        else if (card1>=27 && card1<=39){
            System.out.println("the "+printCard1+" of hearts.");
        }
        else if (card1>=40 && card1<=52){
            System.out.println("the "+printCard1+" of spades.");
        } //end of deck 1
        
        
        
        //assigns suit value for deck 2
        //prints the card identity for deck 2
        if (card2<=13){
            System.out.println("the "+printCard2+" of diamonds.");
        }
        else if (card2>=14 && card2<=26){
            System.out.println("the "+printCard2+" of clubs.");
        }
        else if (card2>=27 && card2<=39){
            System.out.println("the "+printCard2+" of hearts.");
        }
        else if (card2>=40 && card2<=52){
            System.out.println("the "+printCard2+" of spades.");
        } //end of deck 2
        
        
        
        //assigns suit value for deck 3
        //prints the card identity for deck 3
        if (card3<=13){
            System.out.println("the "+printCard3+" of diamonds.");
        }
        else if (card3>=14 && card3<=26){
            System.out.println("the "+printCard3+" of clubs.");
        }
        else if (card3>=27 && card3<=39){
            System.out.println("the "+printCard3+" of hearts.");
        }
        else if (card3>=40 && card3<=52){
            System.out.println("the "+printCard3+" of spades.");
        } //end of deck 3
        
        
        
        //assigns suit value for deck 4
        //prints the card identity for deck 4
        if (card4<=13){
            System.out.println("the "+printCard4+" of diamonds.");
        }
        else if (card4>=14 && card4<=26){
            System.out.println("the "+printCard4+" of clubs.");
        }
        else if (card4>=27 && card4<=39){
            System.out.println("the "+printCard4+" of hearts.");
        }
        else if (card4>=40 && card4<=52){
            System.out.println("the "+printCard4+" of spades.");
        } //end of deck 4
        
        
        
        //assigns suit value for deck 5
        //prints the card identity for deck 5
        if (card5<=13){
            System.out.println("the "+printCard5+" of diamonds.");
        }
        else if (card5>=14 && card5<=26){
            System.out.println("the "+printCard5+" of clubs.");
        }
        else if (card5>=27 && card5<=39){
            System.out.println("the "+printCard5+" of hearts.");
        }
        else if (card5>=40 && card5<=52){
            System.out.println("the "+printCard5+" of spades.");
        } //end of deck 5
        
        
        //declare a variable to store when the random cards form one pair
        boolean onePair = (printCard1==printCard2 || printCard1==printCard3 || printCard1==printCard4 || printCard1==printCard5 ||
                        printCard2==printCard3 || printCard2==printCard4 || printCard2==printCard5 ||
                        printCard3==printCard4 || printCard3==printCard5 ||
                        printCard4==printCard5);
        //declare a variable to store when the random cards form two pairs
        boolean twoPair = ((printCard1==printCard2 && printCard3==printCard4) || (printCard1==printCard2 && printCard4==printCard5) || (printCard1==printCard2 && printCard3==printCard5) ||
                        (printCard1==printCard3 && printCard2==printCard4) || (printCard1==printCard3 && printCard2==printCard5) || (printCard1==printCard3 && printCard4==printCard5) ||
                        (printCard1==printCard4 && printCard2==printCard3) || (printCard1==printCard4 && printCard3==printCard5) || (printCard1==printCard4 && printCard2==printCard5) || 
                        (printCard1==printCard5 && printCard2==printCard3) || (printCard1==printCard5 && printCard2==printCard4) || (printCard1==printCard5 && printCard3==printCard4) || 
                        (printCard2==printCard3 && printCard4==printCard5) || (printCard2==printCard4 && printCard3==printCard5) || (printCard2==printCard5 && printCard3==printCard4));
        //declare a variable to store when the random cards form three of a kind
        boolean threeKind = ((printCard1==printCard2 && printCard1==printCard3) || (printCard1==printCard2 && printCard1==printCard4) || (printCard1==printCard2 && printCard1==printCard5) || 
                            (printCard1==printCard3 && printCard1==printCard4) || (printCard1==printCard3 && printCard1==printCard5) || (printCard1==printCard4 && printCard1==printCard5) ||
                            (printCard2==printCard3 && printCard2==printCard4) || (printCard2==printCard3 && printCard2==printCard5) ||
                            (printCard2==printCard4 && printCard2==printCard5) || (printCard3==printCard4 && printCard3==printCard5));
        //declare a variable to store when the random cards form no matches
        boolean noMatch = (printCard1!=printCard2 && printCard1!=printCard3 && printCard1!=printCard4 && printCard1!=printCard5 &&
                        printCard2!=printCard3 && printCard2!=printCard4 && printCard2!=printCard5 && 
                        printCard3!=printCard4 && printCard3!=printCard5 && 
                        printCard4!=printCard5);


        //if the random cards form three of a kind, print. if not, move on
        if (threeKind==true) {
            System.out.println("You have three of a kind!");
        }
        //if the random cards form two pairs, print. if not, move on
        else if (twoPair==true) {
            System.out.println("You have two pairs!");
        }
        //if the random cards form one pair, print. if not, move on
        else if (onePair==true) {
            System.out.println("You have one pair!");
        }
        //if the random cards do not form three of a kind, two pairs, or one pair, print.
        else {
            System.out.println("You have a high card hand!");
        }


    } //ends main method
    
} //ends class Poker