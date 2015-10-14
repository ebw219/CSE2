/*Emily Weston
HW 07
Twisty
The purpose of this program is to practice using different types of loops and nested loops, as well as statments.*/

import java.util.Scanner; //imports Scanner class

public class Twisty {
    
    public static void main(String[] args) {
        
        Scanner myScanner=new Scanner (System.in); //declares an instance of scanner
        
        System.out.println("Input your desired length: ");
        int length=myScanner.nextInt(); //creates a scanner variable to store the user's input
        
        while (length==length) { //declares a condition that makes the loop possible
            if (length<0) { //sets condition for if statement
                System.out.print("ERROR please enter a positive integer: "); //tells the user that their number is invalid and prompts them to enter a new one
                length=myScanner.nextInt(); //declares and instance of Scanner so the user can enter a new number
            } //ends if statement
            if (length>80) { //sets condition for if statement
                System.out.print("ERROR please enter an integer smaller than 80: "); //tells the user that their number is invalid and prompts them to enter a new one
                length=myScanner.nextInt(); //declares an instance of Scanner so the user can enter a new number
            } //ends if statement
            else {
                break; //breaks the if statement and the while loop to prevent the loop from becoming infinite and breaking the program
            } //ends else statement
        } //ends while loop        
        
        
        System.out.println("Input your desired width: ");
        int width=myScanner.nextInt(); //creates a scanner variable to store the user's input
        
        while (width==width) { //declares a condition that makes the loop possible
            if (width<0) { //sets condition for if statement
                System.out.print("ERROR please enter a positive integer: "); //tells the user that their number is invalid and prompts them to enter a new one
                width=myScanner.nextInt(); //declares an instance of Scanner so the user can enter a new number
            } //ends if statement
            else if (width>length) {
                System.out.print("ERROR please enter an integer smaller than length: "); //tells the user that their number is invalid and prompts them to enter a new one
                width=myScanner.nextInt(); //declares an instance of Scanner so the user can enter a new number
            } //ends else if statement
            else {
                break; //breaks the if statement and the while loop to prevent the loop from becoming infinite and breaking the program
            } //ends else statement
        } //ends while loop
        
        int p=0; //declares and defines variables to be used in determining what the program should print
        int g=1;
        int w=2;
        int z=1;
    if (width%2==0) { //outer if statement--condition determining if the user's input width is even or odd--continues if even
        for (int q=0; q<width; q++) { //outer for loop--condition
            for (int b=0; b<length; b++) { //inner for loop--condition
                if (b==p*width+q || b==g*width+q || b==w*width-q-1 || b==z*width-q-1) { //large inner if statement--condition to enter the inner if statements
                    if (b==p*width+q) { //inner if statement--condition to print downward hashtag line
                        System.out.print("#");
                        p+=2;
                    } //ends inner if statement
                    if (b==w*width-q-1) { //inner if statement--condition to print upward hashtag line
                        System.out.print("#");
                        w+=2;
                    } //ends inner if statement
                    if (b==z*width-q-1) { //inner if statement--condition to print upward slash line
                        System.out.print("/");
                        z+=2;
                    } //ends inner if statement
                    if (b==g*width+1) { //inner if statement--condition to print downward slash line
                        System.out.print("\\");
                        g+=2;
                    } //ends inner if statement
                } //ends large inner if statement
                else { //if none of the inner if statement conditions are met
                    System.out.print(" ");
                } //ends else statement (attached to large inner if statement)
            } //end inner loop
        } //end outer loop
    } //end outer if statement
    else { //else statement--if the user's input is odd
        p=0; //redefines variables used to determine what the program should print so the loops can run again
        g=1;
        w=2;
        z=1;
        
        for (int q=0; q<width; q++) { //outer for loop--condition
            for (int b=0; b<length; b++) { //inner for loop--condition
                if (b==p*width+q || b==g*width+q || b==w*width-q-1 || b==z*width-q-1) { //large inner if statement--condition to enter the inner if statements
                    if (b==p*width+q && b==z*width-q-1) { //inner if statement--condition for if the center of the x should have hashtag on top
                        System.out.print("#");
                        p+=2;
                        z+=2;
                    } //ends inner if statement
                    if (b==w*width-q-1 && b==g*width+q) { //inner if statement--condition for if the center of the x should have slash on top
                        System.out.print("\\");
                        w+=2;
                        z+=2;
                    } //ends inner if statement
                    else { //if neither of the inner if statement conditions are met
                        if (b==p*width+q && b!=z*width-q-1) { //inner inner if statement--condition to print downward hashtag line
                            System.out.print("#");
                            p+=2;
                        } //ends inner inner if statement
                        if (b==w*width-q-1 && b!=g*width+q) { //inner inner if statement--condition to print upward hashtag line
                            System.out.print("#");
                            w+=2;
                        } //ends inner inner if statement
                        if (b==z*width-q-1 && b!=p*width+q) { //inner inner if statement--condition to print upward slash line
                            System.out.print("/");
                            z+=2;
                        } //ends inner inner if statement
                        if (b==g*width+q && b!=w*width-q-1) { //inner inner if statement--condition to print downward slash line
                            System.out.print("\\");
                            g+=2;
                        } //ends inner inner if statement
                    } //ends inner else statement
                } //ends large inner if statement
                else { //if none of the large inner if statement conditions are met
                    System.out.print(" ");
                } //ends else statement (attached to large inner if statement)
            } //end of inner for loop
            
            System.out.println("");
            p=0; //redefines variables used to determine what the program should print so the loops can run again
            g=1;
            w=2;
            z=1;
        } //end of outer for loop
    } //end else statement

        
    } //ends main method
    
} //ends class Twisty