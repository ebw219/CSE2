//Emily Weston
//9-11-15
//HW 03
//Timer
//
//the purpose of this program is to take user input and use it to
//calculate the amount of time remaining before dinner

import java.util.Scanner; //imports Scanner class in order to use it

public class Timer {
    
    public static void main(String[] args) {
        
        Scanner myScanner=new Scanner (System.in); //declare an instance of Scanner
        
        System.out.print("Enter the current time in form HHMM: ");
        //prompts user to input the current time
        double currentTime = myScanner.nextDouble();
        //accepts user input and stores it

        System.out.print("Enter the time you will be eating dinner in form HHMM: ");
        //prompts user to input time he/she will be eating dinner
        double dinnerTime = myScanner.nextDouble();
        //accepts user input and stores it
        
        double timeLeft = dinnerTime - currentTime;
        int hoursLeft = (int)timeLeft/100;
        int minutesLeft = (int)(timeLeft)%100;
        
        
        System.out.println("You have " + hoursLeft + " hours and " + minutesLeft + " minutes until dinner.");
        
        
    } //ends main method
    
} //ends class Timer