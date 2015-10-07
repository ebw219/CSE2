import java.util.Scanner; //imports Scanner class

public class BarGraph {
    
    public static void main(String[] args) {
        
        Scanner myScanner=new Scanner (System.in); //declares an instance of scanner
//Monday
        System.out.print("Expenses for Monday: $"); //prompts user to input a value for Monday
        double Monday=myScanner.nextDouble(); //creates a scanner variable to store the user's input
        
        while (Monday==Monday) { //declares a condition that makes the loop possible
            if (Monday<0) { //sets condition for if statement
                System.out.print("ERROR please enter a positive integer: $"); //tells the user that their number is invalid and prompts them to enter a new one
                Monday=myScanner.nextDouble(); //declares an instance of Scanner so the user can enter a new number
            } //ends if statement
            else {
                break; //breaks the if statement and the while loop to prevent the loop from becoming infinite and breaking the program
            } //ends else statement
        } //ends while loop
        
//Tuesday
        System.out.print("Expenses for Tuesday: $"); //prompts user to input a value for Tuesday
        double Tuesday=myScanner.nextDouble(); //creates a scanner variable to store the user's input
        
        while (Tuesday==Tuesday) { //declares a condition that makes the loop possible
            if (Tuesday<0) { //sets condition for if statement
                System.out.print("ERROR please enter a positive integer: $"); //tells the user that their number is invalid and prompts them to enter a new one
                Tuesday=myScanner.nextDouble(); //declares an instance of Scanner so the user can enter a new number
            } //ends if statement
            else {
                break; //breaks the if statement and the while loop to prevent the loop from becoming infinite and breaking the program
            } //ends else statement
        } //ends while loop

//Wednesday
        System.out.print("Expenses for Wednesday: $"); //prompts user to input a value for Wednesday
        double Wednesday=myScanner.nextDouble(); //creates a scanner variable to store the user's input
        
        while (Wednesday==Wednesday) { //declares a condition that makes the loop possible
            if (Wednesday<0) { //sets condition for if statement
                System.out.print("ERROR please enter a positive integer: $"); //tells the user that their number is invalid and prompts them to enter a new one
                Wednesday=myScanner.nextDouble(); //declares an instance of Scanner so the user can enter a new number
            } //ends if statement
            else {
                break; //breaks the if statement and the while loop to prevent the loop from becoming infinite and breaking the program
            } //ends else statement
        } //ends while loop

//Thursday
        System.out.print("Expenses for Thursday: $"); //prompts user to input a value for Thursday
        double Thursday=myScanner.nextDouble(); //creates a scanner variable to store the user's input
        
        while (Thursday==Thursday) { //declares a condition that makes the loop possible
            if (Thursday<0) { //sets condition for if statement
                System.out.print("ERROR please enter a positive integer: $"); //tells the user that their number is invalid and prompts them to enter a new one
                Thursday=myScanner.nextDouble(); //declares an instance of Scanner so the user can enter a new number
            } //ends if statement
            else {
                break; //breaks the if statement and the while loop to prevent the loop from becoming infinite and breaking the program
            } //ends else statement
        } //ends while loop

//Friday
        System.out.print("Expenses for Friday: $"); //prompts user to input a value for Friday
        double Friday=myScanner.nextDouble(); //creates a scanner variable to store the user's input
        
        while (Friday==Friday) { //declares a condition that makes the loop possible
            if (Friday<0) { //sets condition for if statement
                System.out.print("ERROR please enter a positive integer: $"); //tells the user that their number is invalid and prompts them to enter a new one
                Friday=myScanner.nextDouble(); //declares an instance of Scanner so the user can enter a new number
            } //ends if statement
            else {
                break; //breaks the if statement and the while loop to prevent the loop from becoming infinite and breaking the program
            } //ends else statement
        } //ends while loop

//Saturday
        System.out.print("Expenses for Saturday: $"); //prompts user to input a value for Saturday
        double Saturday=myScanner.nextDouble(); //creates a scanner variable to store the user's input
        
        while (Saturday==Saturday) { //declares a condition that makes the loop possible
            if (Saturday<0) { //sets condition for if statement
                System.out.print("ERROR please enter a positive integer: $"); //tells the user that their number is invalid and prompts them to enter a new one
                Saturday=myScanner.nextDouble(); //declares an instance of Scanner so the user can enter a new number
            } //ends if statement
            else {
                break; //breaks the if statement and the while loop to prevent the loop from becoming infinite and breaking the program
            } //ends else statement
        } //ends while loop

//Sunday
        System.out.print("Expenses for Sunday: $"); //prompts user to input a value for Sunday
        double Sunday=myScanner.nextDouble(); //creates a scanner variable to store the user's input
        
        while (Sunday==Sunday) { //declares a condition that makes the loop possible
            if (Sunday<0) { //sets condition for if statement
                System.out.print("ERROR please enter a positive integer: $"); //tells the user that their number is invalid and prompts them to enter a new one
                Sunday=myScanner.nextDouble(); //declares an instance of Scanner so the user can enter a new number
            } //ends if statement
            else {
                break; //breaks the if statement and the while loop to prevent the loop from becoming infinite and breaking the program
            } //ends else statement
        } //ends while loop
        
        
        System.out.println("Expenses for Monday: $" + Monday);
        System.out.println("Expenses for Tuesday: $" + Tuesday);
        System.out.println("Expenses for Wednesday: $" + Wednesday);
        System.out.println("Expenses for Thursday: $" + Thursday);
        System.out.println("Expenses for Friday: $" + Friday);
        System.out.println("Expenses for Saturday: $" + Saturday);
        System.out.println("Expenses for Sunday: $" + Sunday);

        
        
//Monday
        System.out.println(" ");
        System.out.print("Monday: ");
        int check=1; //declares variable to prevent the loop from being infinite
        while (check<=Monday && Monday>=0) { //sets condition for while loop
                System.out.print("*");
                check++;
        } //ends outer while loop
        
//Tuesday
        System.out.println(" ");
        System.out.print("Tuesday: ");
        int check1=1;
            while (check<=Tuesday && Tuesday>=0) {
                System.out.print("*");
                check1++;
        } //ends outer while loop

//Wednesday
        System.out.println(" ");
        System.out.print("Wednesday: ");
        while (check<=Wednesday) { //sets condition for while loop
            while (Wednesday>=0 && check<=Wednesday) {
                System.out.print("*");
                check++;
            } //ends inner while loop
        } //ends outer while loop
        
//Thursday
        System.out.println(" ");
        System.out.print("Thursday: ");
        while (check<=Thursday) { //sets condition for while loop
            while (Thursday>=0 && check<=Thursday) {
                System.out.print("*");
                check++;
            } //ends inner while loop
                            System.out.println("KILL ME PLS");

        } //ends outer while loop
        
//Friday
        System.out.println(" ");
        System.out.print("Friday: ");
        while (check<=Friday) { //sets condition for while loop
            while (Friday>=0 && check<=Friday) {
                System.out.print("*");
                check++;
            } //ends inner while loop
        } //ends outer while loop
        
//Saturday
        System.out.println(" ");
        System.out.print("Saturday: ");
        while (check<=Saturday) { //sets condition for while loop    
            while (Saturday>=0 && check<=Saturday) {
                System.out.print("*");
                check++;
            } //ends inner while loop
        } //ends outer while loop
        
//Sunday
        System.out.println(" ");
        System.out.print("Sunday: ");
        while (check<=Sunday) { //sets condition for while loop
            while (Sunday>=0 && check<=Sunday) {
                System.out.print("*");
                check++;
            } //ends inner while loop
        } //ends outer while loop
        
    System.out.println(" ");
    
    
    //double average=((Monday + Tuesday + Wednesday + Thursday + Friday + Saturday + Sunday)/7);
   // System.out.println("The average is: $" + average);
        
    } //ends main method
    
} //ends class Bar