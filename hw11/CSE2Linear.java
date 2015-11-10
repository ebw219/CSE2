/*
Emily Weston
HW 11
Fun with Searching
The purpose of this program is to practice searching single dimensional arrays.
*/

import java.util.Scanner; //imports Scanner
import java.util.Random; //imports Random

public class CSE2Linear {
    

    public static void binarySearch(int[] finalGrades, int gradeSearch) { //opens method linearSearch
        int q=0; //creates variable to count interations
        int low=0; //creates variable for lowest spot in the array
        int high=finalGrades.length-1; //creates variable for highest spot in the array
        int mid=(low+high)/2; //creates variable in the middle of the array
        while (low<=high) { //while loop to run binary search
            q++; //increases variable with each iteration
            if (finalGrades[mid]<gradeSearch) { //enter if statement if value to search for is in the upper half of the array
                low=mid+1; //redefines lowest spot in the array as one above the old mid
                mid=(low+high)/2; //redefines the middle value of the array
            } //ends if statement
            else if (finalGrades[mid]==gradeSearch) { //enter else if statement if the middle value is equal to the value to search for
                System.out.println(gradeSearch + " was found with " + q + " iterations."); //tells user their value was found
                break;
            } //ends else if statement
            else { //enter else statement if value to search for is in the upper half of the array
                high=mid-1; //redefines highest spot in the array as one below the old mid
                mid=(low+high)/2; //redefines the middle value of the array
            } //ends else statement
            if (low>high) { //enter if statement if value to search for cannot be found in any part of the array
                System.out.print(gradeSearch + " was not found with " + q + " iterations."); //tells user their value was not found
                break;
            } //ends if statement
        } //ends while loop
        
    } //ends method linearSearch
    
    public static void scramble(int[] finalGrades) { //opens method scramble
        int z=0; //declares a variable
        for (int q=0; q<finalGrades.length; q++) { //condition for the for loop-->shuffles list 15 times
            z=(int)(Math.random()*finalGrades.length); //chooses a random number for z to assign a new value to its spot
            int helper=finalGrades[0]; //declares an int to store the 0th value to the array
            finalGrades[0]=finalGrades[z]; //assigns the value of the zth spot to the 0th spot in the array
            finalGrades[z]=helper; //assigns the value of the zth spot to the original value of the 0th spot in the array
        } //ends for loop
        
        System.out.printf("%n"); //line break
        System.out.print("These are the scrambled final grades: ");
        for (int p=0; p<finalGrades.length; p++) { //for loop to control printing of the final input array
            System.out.print(finalGrades[p] + " "); //prints final input array
        } //ends for loop
        
    } //ends method scramble
    
    public static void linearSearch(int[] finalGrades, int gradeSearch) { //opens mehtod linearSearch
        for (int q=0; q<finalGrades.length; q++) { //for loop to run linear search
            if (finalGrades[q]==gradeSearch) { //enter if statement if value to search for is equal to the value at the current spot in the array
                System.out.println(gradeSearch + " was found with " + q + " iterations."); //tells user their value was found
                break; //breaks the loop
            } //ends if statement
            else if (q==finalGrades.length-1 && finalGrades[q]!=gradeSearch) { //enter else if statement if loop reaches last value of the array and the value to be searched for has not been found
                System.out.println(gradeSearch + " was not found with " + q + " iterations."); //tells user their value was not found
            } //ends else if statement
        } //ends for loop
        
    } //ends method linearSearch
    
    
    public static void main(String[] args) { //opens main method
        
        Scanner myScanner=new Scanner (System.in); //declares an instance of scanner
        
        System.out.println("Please enter 15 integers for students' final exam grades: "); //prompts user to enter 15 ints
        int [] finalGrades=new int[15]; //creates array for the user's ints
        int grade=0; //creates variable to store ints as user inputs them
        int helper=0; //creates a variable to help manage the conditions for each new inputed integer

        for (int q=0; q<finalGrades.length; q++) { //for loop condition to control input of ints
            if (!myScanner.hasNextInt()) { //enter if statement if user input is not an integer
                System.out.println("ERROR please enter an integer: "); //prompts user to input a new integer
                myScanner.next(); //stores new user input in grade variable
            } //ends if statement
            else { //enter else statement if user input is an integer
                grade=myScanner.nextInt(); //stores user input in grade variable
                if (grade<0 || grade>100) { //enter inner if statement if user input is out of range
                    System.out.println("ERROR please enter an integer between 0 and 100: "); //prompts user to enter a new integer
                } //ends inner if statement
                else if (helper>grade) { //enter inner else if statement if user input is not greater than or equal to the previous one
                    System.out.println("ERROR please enter an integer greater than or equal to the last: "); //prompts user to enter a new integer
                } //ends inner if else statement
                else { //enters inner else statement if none of the above inner statments are entered
                    helper=grade; //sets helper variable equal to the current user input-->it can be used in the above conditions for the next user input
                    finalGrades[q]=grade; //sets current user input equal to the current spot in the array
                } //ends inner else statement
            } //ends else statement
        } //ends for loop
        
        System.out.print("These are all the final grades: ");
        for (int p=0; p<finalGrades.length; p++) { //for loop to control printing of the final input array
            System.out.print(finalGrades[p] + " "); //prints final input array
        } //ends for loop
        
        System.out.printf("%n"); //line break
        System.out.println("Please enter a grade to be searched for: "); //prompts user to input a grade to search for
        int gradeB=myScanner.nextInt(); //creates variable to store user input
        
        binarySearch(finalGrades, gradeB); //runs method binarySearch
        
        scramble(finalGrades); //runs method scramble
        
        System.out.printf("%n"); //line break
        System.out.println("Please enter a grade to be searched for: "); //prompts user to input a grade to search for
        int gradeL=myScanner.nextInt(); //creates variable to store user input
        
        linearSearch(finalGrades, gradeL); //runs method linearSearch
        
    } //ends main method
    
} //ends class CSE2Linear