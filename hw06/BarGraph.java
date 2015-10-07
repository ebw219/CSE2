/*
Emily Weston
HW 06
the purpose of this homework is to practice using loops
this homework tracks expenses for each day of the week, then represents the values in a bar graph
*/

import java.util.Scanner; //imports Scanner class

public class BarGraph {
    
    public static void main(String[] args) {
        
        Scanner myScanner=new Scanner (System.in); //declares an instance of Scanner
      
        System.out.print("Expenses for Monday: $"); //prompts user for money spend on Monday
        double Monday=myScanner.nextDouble(); //accepts user input and stores it
        
            
        String asterisk="*";
        int most=1;
    while (Monday==Monday) {
        while (Monday>0) {
            System.out.print("Monday: ");
        while (most<=Monday && Monday>=0) {
            System.out.print(asterisk);
            most++;
        }
        }
        while (Monday<0) {
            while (Monday<0) {
            System.out.print("ERROR please enter a positive number: $");
            Monday=myScanner.nextDouble();
            break;
        }
        }
        break;

} //ends if statement

    } //ends main method
    
} //ends class BarGraph