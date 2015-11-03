/*
Emily Weston
HW 10
Shuffling
The purpose of this program is to practice manipulating arrays and writing methods that have array parameters.
*/

import java.util.Scanner; //imports Scanner class

public class Shuffling {
    
    public static void printArray(String[] list) { //print array method
        int q=0; //declares a variable
        while (q<52) { //while loop to print each card in the deck
            System.out.print(list[q] + " "); //prints card name
            if (q>list.length-2) { //if statement to break the loop when it reaches the end of the array so it doesn't run too many times
                break;
            }
            q++; //increases q so the loop will continue to run
        }//ends while loop
        System.out.println(" "); //prints a line
    } //ends print array method
    
    
    
    public static String [] shuffle(String[] list) { //shuffle method
        int p=0; //declares a variable
        for (int q=0; q<520; q++) { //condition for the for loop-->shuffles the deck 520 times
            p = (int)((Math.random()*51)+1); //chooses a random number for p to assign a new value to its spot
            String helper = list[0]; //declares a string to store the 0th value in the array
            list[0] = list [p]; //assigns the value of the pth spot to the 0th spot in the array
            list [p] = helper; //assigns the value of the pth spot to the original value of the 0th spot in the array
        } //ends for loop
        
        return list; //returns the changes made to the list
        
    } //ends shuffle method
    
    
    public static String [] randomizeHand(String [] list) { //randomizeHand method
        int p=1; //declares a variable
        String [] helper = new String[5]; //creates a new array in the method to store the five randomly picked cards
        for (int q=0; q<5; q++) { //for loop to pick the five random cards
            p=(int)(Math.random()*51)+1; //variable is defined as a random number-->randomly picks five cards
            helper [q] = list [p]; //sets the new array equal to the array that already existed so it can access the five card identities
            if (q>0 && helper[q].equals(helper[q-1])) { //ensures that none of the randomly picked cards are the same
                q--;
            }
            else if (q>1 && helper[q].equals(helper[q-2])) {
                q--;
            }
            else if (q>2 && helper[q].equals(helper[q-3])) {
                q--;
            }
            else if (q>3 && helper[q].equals(helper[q-4])) {
                q--;
            }
        } //ends if statement
        
        return helper; //returns the array with the identities of the five randomly picked cards in it
        
    } //ends randomizeHand method
    
    
    public static void main(String[] args) { //main method
        
    String[] suits={"C", "H", "S", "D"}; //suits clubs, hearts, spades, diamonds
    String[] rank={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"}; //ranks of the cards
    String[] cards=new String[52]; //creates an array to hold all of the cards
    String[] hand=new String[5]; //creates an array to hold the randomly picked cards
    
    for (int q=0; q<52; q++) { //for loop to assign card names and suits to each card
        cards[q]=rank[q%13]+suits[q/13]; //assigns card names and suits to each card and puts them in an array
    } //ends for loop
    
    printArray(cards); //runs printArray method; prints the cards in their original order
    shuffle(cards); //runs shuffle method
    System.out.println("Shuffled!");
    printArray(cards); //prints the cards in their shuffled order
    hand=randomizeHand(cards); //runs randomizeHand method
    System.out.println("Randomized hand!");
    printArray(hand); //prints randomly picked cards
        
        
    } //ends main method
    
} //ends class Shuffling