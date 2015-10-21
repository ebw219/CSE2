/*
Emily Weston
HW 08
String Analysis
The purpose of this program is to practice writing methods, overloading methods, and forcing the user to enter good input.
*/

import java.util.Scanner; //imports Scanner class

public class StringAnalysis { //starts class StringAnalysis
    
    public static boolean determine(String word) { //starts method string determine

        boolean p=true;
        for (int q=0; q<word.length(); q++) { //for loop
            char charLocation=word.charAt(q); //finds each char at each location in the string
            if (charLocation>='a' && charLocation<='z') { //checks if each char is a real char
                p=false;
                System.out.println("just letters");
            } //ends if statement
            else {
                System.out.println("not just letters");
            } //ends else statement
        } //end for loop
        return p; //makes the method keep its data
    } //ends method string determine
    
    
    
    public static boolean determine(String word, int number) { //starts method string, int determine
        boolean p=true;
        for (int q=0; q<number; q++) { //for loop
            char charLocation=word.charAt(q); //finds each char at each location in the string
            if (charLocation<'a' || charLocation>'z') { //checks if each char is a real char
                p=false;
                System.out.println("Your string is not just letters.");
            } //ends if statement
            else {
                p=true;
                System.out.println("Your string is just letters.");
            } //ends else statement
        } //ends for loop
        return p; //makes the method keep its data
    } //ends method string, int determine
    
    
    
    public static void main(String[] args) { //starts main method
        
        Scanner myScanner=new Scanner (System.in); //declares an instance of scanner


        System.out.print("Please enter a string: ");
        String input=myScanner.next(); //accepts user input
        
        
        System.out.print("If you want to check the whole string, enter yes. If you only want to check part of the string, enter no.");
        String check=myScanner.next(); //accepts user input
        
        String words="yes";
        String part="no";
        
        if (check.equals("yes")) { //if the user wants to check the whole string for chars
            boolean valid=determine(input); //runs method string determine
        } //ends if statement
        else if (check.equals("no")) { //if the user wants to check only part of the string for chars
            System.out.println("How many characters would you like to check?");
            int number=myScanner.nextInt(); //accepts user input
            boolean invalid=determine(input, number); //runs method string, int determine
        } //ends else statement
        
        
    } //ends main method
    
    
    
} //ends class StringAnalysis