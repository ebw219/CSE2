//Emily Weston
//9-11-15
//Lab 03
//Check
//
//the purpose of this program is to demonstrate how to get input from the user
//and then use that data to perform basic computations

import java.util.Scanner; //imports Scanner class in order to use it

public class Check {
    
    public static void main(String[] args) {
        
        Scanner myScanner=new Scanner (System.in); //declare an instance of Scanner
        
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        //prompts user to input original cost of the check
        double checkCost = myScanner.nextDouble(); //accepts user input
        
        System.out.print("Enter the percentage tip that you wish to pay as a whole number in the form xx: ");
        //prompts user to input percentage tip
        double tipPercent = myScanner.nextDouble(); //accepts user input
        tipPercent /= 100; //converts percentage into a decimal value
        
        System.out.print("Enter the number of people who went out to dinner: ");
        //prompts user to input number of people who went to dinner
        int numPeople = myScanner.nextInt(); //accepts user input
        
        double totalCost;
        double costPerPerson;
        int dollars, dimes, pennies; //dollar amount of cost, dimes and pennies for digits to the right of decimal place
        
        totalCost = checkCost * (1 + tipPercent); //total cost with tip
        costPerPerson = totalCost / numPeople; //total cost per person
        dollars=(int)costPerPerson; //gets whole amount without the decimal
        dimes=(int)(costPerPerson * 10) % 10; //dimes amount of cost
        pennies=(int)(costPerPerson * 100) % 10; //pennies amount of cost
        
        System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);
    
        
        
        
    } //ends main method
    
} //ends class Check